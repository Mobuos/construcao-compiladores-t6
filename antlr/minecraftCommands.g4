grammar minecraftCommands;

//-- LÉXICO --

STRING: '"' ~('\n' | '"')* '"';
// Erro de cadeia de string
// Verifica qualquer cadeia que não foi fechada. Deve vir abaixo da CADEIA
// pois senão pode gerar conflito de nunca encontrar a cadeia.
CADEIA_N_FECHADA : '"' ( ~('\n'|'"') )*? ';';
NUM_INT: ('0'..'9')+;
NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;
COR_HEX: '#' 
    ('0'..'9' | 'A'..'F' | 'a'..'f')
    ('0'..'9' | 'A'..'F' | 'a'..'f')
    ('0'..'9' | 'A'..'F' | 'a'..'f')
    ('0'..'9' | 'A'..'F' | 'a'..'f')
    ('0'..'9' | 'A'..'F' | 'a'..'f')
    ('0'..'9' | 'A'..'F' | 'a'..'f');

// Espaço em branco.
WS: ( ' ' | '\t' | '\r' | '\n' ) {self.skip()};


// Comentário: Comentário (Comentário)
COMENTARIO: '//' ~('\n')*? {self.skip()};

// Palavras chaves
DAR_ITEM: 'dar_item';
TELEPORTE: 'teleporte' | 'tp';
ENCANTAR: 'encantar';
CRIAR_MOB: 'criar_mob';
CONQUISTA: 'conquista';
NOME: 'nome';
LORE: 'lore';

ALVO: '->';
ATRIBUICAO: '=';
NEGACAO: '-';
ADICAO: '+';
SEPARADOR_COMANDO: ':';
VIRGULA: ',';
FIM_COMANDO: ';';


// Identificadores de variáveis.
// Identificadores começam com qualquer letra, maiúscula 
// ou minuscula, seguida de qualquer letra, ou digito, ou '_'.
IDENT: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

ERRO: .;

//-- SINTÁTICA --
coordenadas: '(' coordenada_termo ',' coordenada_termo ',' coordenada_termo ')';
coordenada_termo: ('~'? (NUM_REAL | NUM_INT)) | '~';
origem_tp: STRING | IDENT;
destino_tp: STRING | coordenadas | IDENT;
player: STRING | IDENT;
item: STRING | IDENT;
mod: modificador_item | modificador_mob | IDENT;
encantamento_var: STRING | IDENT;
mob: STRING | IDENT;
coordenada_var: coordenadas | IDENT;
conquista_var: STRING | IDENT;
texto: STRING | IDENT;
cor: COR_HEX | IDENT;
exibicao_var: texto (',' cor)?;
lore_mod_item: (LORE ':' exibicao_var (ADICAO exibicao_var)*);
nome_mod_item: (NOME ':' exibicao_var (ADICAO exibicao_var)*);

programa: (cmd';')*;
cmd
    : cmd_dar_item 
    | cmd_teleporte 
    | cmd_criar_mob
    | cmd_conquista
    | cmd_atribuicao
;
cmd_dar_item: DAR_ITEM ':' item (',' NUM_INT)? (',' mod*)? ('->' player)?; 
cmd_teleporte: TELEPORTE ':' (origem_tp '->')? destino_tp;
cmd_criar_mob: CRIAR_MOB ':' mob (',' coordenada_var)? (',' mod*)?;
cmd_conquista: CONQUISTA ':' '-'? conquista_var ('->' player)?;
cmd_atribuicao: IDENT '=' (coordenadas | STRING | modificador_item | modificador_mob | COR_HEX);

// Modificador par encantamento, tendo a seguinte estrutura: 'encantamentos: [ ("Nome encantamento", nivel encantamento), ...]. 
mod_encantamento
    : 'encantamento' ':' encantamento_var ',' NUM_INT (ADICAO encantamento_var ',' NUM_INT )*;

// Modificador de exibição, estrutura: 'nome: "Item mágico", #0000FF' ou 'lore: "Incrível item\n Feito por Votor", #0000FF'
mod_exibicao
    : nome_mod_item?
    lore_mod_item?
    ;

// Modificador, indica que o item é inquebrável
mod_inquebravel
    : 'inquebravel';

// Modificador de nome, estrutura: 'nome: "Mob Mágico", #0000FF'
mod_nome_mob
    : 'nome_mob' ':' texto (',' cor)?;

// Modificador, indica que o mob não possui IA
mod_semIA
    : 'semIA';

// Modificador, indica que o mob é invulnerável
mod_invulneravel
    : 'invulneravel';

// Modificador, indica a quantidade de vida que um mob tem.
mod_vida
    : 'vida' ':' (NUM_REAL | NUM_INT);

// Modificadores compatíveis com mobs
modificador_mob
    : '{' 
    (
        mod_nome_mob
        | mod_semIA
        | mod_vida
        | mod_invulneravel
    )
    '}'
    ;

// Modificadores compatíveis com itens
modificador_item
    : '{'
    (
        mod_encantamento
        | mod_exibicao
        | mod_inquebravel
    )
    '}'
    ;