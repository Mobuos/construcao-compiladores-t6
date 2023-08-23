grammar minecraftCommands;

//-- LÉXICO --

STRING: '"' ~('\n' | '"')* '"';
// Erro de cadeia de string
// Verifica qualquer cadeia que não foi fechada. Deve vir abaixo da CADEIA
// pois senão pode gerar conflito de nunca encontrar a cadeia.
CADEIA_N_FECHADA : '"' ( ~('\n'|'"') )*? ';';
NUM_INT: ('0'..'9')+;
NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;
COR_HEX: '#' ('0'..'9' | 'A'..'F' | 'a'..'f'){6};

// Espaço em branco.
WS: ( ' ' | '\t' | '\r' | '\n' ) {self.skip()};
COORDENADA_TERMO: '~' | NUM_REAL | '~'NUM_REAL; 


// Comentário: Comentário (Comentário)
COMENTARIO: '//' ~('\n')*? {self.skip()};

// Palavras chaves
DAR_ITEM: 'dar_item';
TELEPORTE: 'teleporte' | 'tp';
ENCANTAR: 'encantar';
CRIAR_MONSTRO: 'criar_monstro';
CONQUISTA: 'conquista';

ALVO: '->';
ATRIBUICAO: '=';
NEGACAO: '-';
SEPARADOR_COMANDO: ':';
VIRGULA: ',';
FIM_COMANDO: ';';


// Identificadores de variáveis.
// Identificadores começam com qualquer letra, maiúscula 
// ou minuscula, seguida de qualquer letra, ou digito, ou '_'.
IDENT: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

ERRO: .;

//-- SINTÁTICA --
programa: (cmd';')*;
coordenadas: '(' COORDENADA_TERMO ',' COORDENADA_TERMO ',' COORDENADA_TERMO ')';
origem_tp: STRING | IDENT;
destino_tp: STRING | coordenadas | IDENT;
cmd
    : cmd_dar_item 
    | cmd_teleporte 
    | cmd_encantar
    | cmd_criar_monstro
    | cmd_conquista
    | cmd_atribuicao
;
cmd_dar_item: DAR_ITEM ':' STRING (',' NUM_INT)? (',' modificadores_item)? ('->' STRING)?; 
cmd_teleporte: TELEPORTE ':' (origem_tp '->')? destino_tp;
cmd_encantar: ENCANTAR ':' STRING (',' NUM_INT)? ('->' STRING)?;
cmd_criar_monstro: CRIAR_MONSTRO ':' STRING (',' coordenadas)? (',' modificadores_monstro)?;
cmd_conquista: CONQUISTA ':' '-'? STRING ('->' STRING)?;
cmd_atribuicao: IDENT '=' (coordenadas | STRING | modificadores_item | modificadores_monstro);

// Modificador par encantamento, tendo a seguinte estrutura: 'encantamentos: [ ("Nome encantamento", nivel encantamento), ...]. 
mod_encantamento
    : 'encantamento' ':' STRING ',' NUM_INT ('+' STRING ',' NUM_INT )*;

// Modificador de exibição, estrutura: 'nome: "Item mágico", #0000FF' ou 'lore: "Incrível item\n Feito por Votor", #0000FF'
mod_exibicao
    : 'nome' | 'lore' ':' STRING (',' COR_HEX)? ('+' STRING (',' COR_HEX)?)*;

// Modificador, indica que o item é inquebrável
mod_inquebravel
    : 'inquebravel';

// Modificador de nome, estrutura: 'nome: "Mob Mágico", #0000FF'
mod_nome
    : 'nome' ':' STRING (',' COR_HEX)?;

// Modificador, indica que o monstro não possui IA
mod_semIA
    : 'semIA';

// Modificador, indica que o monstro é invulnerável
mod_invulneravel
    : 'invulneravel';

// Modificador, indica a quantidade de vida que um monstro tem.
mod_vida
    : 'vida' ':' NUM_REAL;

// Modificadores compatíveis com monstros
modificadores_monstro: '{' modificador_monstro '}'*;
modificador_monstro
    : mod_nome
    | mod_semIA
    | mod_vida
    | mod_invulneravel
    ;

// Modificadores compatíveis com itens
modificadores_item: '{' modificador_item '}'*;
modificador_item
    : mod_encantamento
    | mod_exibicao
    | mod_inquebravel
    ;