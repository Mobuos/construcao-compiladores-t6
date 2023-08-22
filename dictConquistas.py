class dictConquistas:
    def __init__(self):
        self.dict = {
            "Minecraft": "story/root",
            "Stone Age": "story/mine_stone",
            "Getting an Upgrade": "story/upgrade_tools",
            "Acquire Hardware": "story/smelt_iron",
            "Suit Up": "story/obtain_armor",
            "Hot Stuff": "story/lava_bucket",
            "Isn't It Iron Pick": "story/iron_tools",
            "Not Today Thank You": "story/deflect_arrow",
            "Ice Bucket Challenge": "story/form_obsidian",
            "Diamonds!": "story/mine_diamond",
            "We Need to Go Deeper": "story/enter_the_nether",
            "Cover Me with Diamonds": "story/shiny_gear",
            "Enchanter": "story/enchant_item",
            "Zombie Doctor": "story/cure_zombie_villager",
            "Eye Spy": "story/follow_ender_eye",
            "The End?": "story/enter_the_end",
            "Nether": "nether/root",
            "Return to Sender": "nether/return_to_sender",
            "Those Were the Days": "nether/find_bastion",
            "Hidden in the Depths": "nether/obtain_ancient_debris",
            "Subspace Bubble": "nether/fast_travel",
            "A Terrible Fortress": "nether/find_fortress",
            "Who is Cutting Onions?": "nether/obtain_crying_obsidian",
            "Oh Shiny": "nether/distract_piglin",
            "This Boat Has Legs": "nether/ride_strider",
            "Uneasy Alliance": "nether/uneasy_alliance",
            "War Pigs": "nether/loot_bastion",
            "Country Lode Take Me Home": "nether/use_lodestone",
            "Cover Me in Debris": "nether/netherite_armor",
            "Spooky Scary Skeleton": "nether/get_wither_skull",
            "Into Fire": "nether/obtain_blaze_rod",
            'Not Quite "Nine" Lives': "nether/charge_respawn_anchor",
            "Feels Like Home": "nether/ride_strider_in_overworld_lava",
            "Hot Tourist Destinations": "nether/explore_nether",
            "Withering Heights": "nether/summon_wither",
            "Local Brewery": "nether/brew_potion",
            "Bring Home the Beacon": "nether/create_beacon",
            "A Furious Cocktail": "nether/all_potions",
            "Beaconator": "nether/create_full_beacon",
            "How Did We Get Here?": "nether/all_effects",
            "The End": "end/root",
            "Free the End": "end/kill_dragon",
            "The Next Generation": "end/dragon_egg",
            "Remote Getaway": "end/enter_end_gateway",
            "The End... Again...": "end/respawn_dragon",
            "You Need a Mint": "end/dragon_breath",
            "The City at the End of the Game": "end/find_end_city",
            "Sky's the Limit": "end/elytra",
            "Great View From Up Here": "end/levitate",
            "Adventure": "adventure/root",
            "Voluntary Exile": "adventure/voluntary_exile",
            "Is It a Bird?": "adventure/spyglass_at_parrot",
            "Monster Hunter": "adventure/kill_a_mob",
            "The Power of Books": "adventure/read_power_of_chiseled_bookshelf",
            "What a Deal!": "adventure/trade",
            "Crafting a New Look": "adventure/trim_with_any_armor_pattern",
            "Sticky Situation": "adventure/honey_block_slide",
            "Ol' Betsy": "adventure/ol_betsy",
            "Surge Protector": "adventure/lightning_rod_with_villager_no_fire",
            "Caves & Cliffs": "adventure/fall_from_world_height",
            "Respecting the Remnants": "adventure/salvage_sherd",
            "Sneak 100": "adventure/avoid_vibration",
            "Sweet Dreams": "adventure/sleep_in_bed",
            "Hero of the Village": "adventure/hero_of_the_village",
            "Is It a Balloon?": "adventure/spyglass_at_ghast",
            "A Throwaway Joke": "adventure/throw_trident",
            "It Spreads": "adventure/kill_mob_near_sculk_catalyst",
            "Take Aim": "adventure/shoot_arrow",
            "Monsters Hunted": "adventure/kill_all_mobs",
            "Postmortal": "adventure/totem_of_undying",
            "Hired Help": "adventure/summon_iron_golem",
            "Star Trader": "adventure/trade_at_world_height",
            "Smithing with Style": "adventure/trim_with_all_exclusive_armor_patterns",
            "Two Birds One Arrow": "adventure/two_birds_one_arrow",
            "Who's the Pillager Now?": "adventure/whos_the_pillager_now",
            "Arbalistic": "adventure/arbalistic",
            "Careful Restoration": "adventure/craft_decorated_pot_using_only_sherds",
            "Adventuring Time": "adventure/adventuring_time",
            "Sound of Music": "adventure/play_jukebox_in_meadows",
            "Light as a Rabbit": "adventure/walk_on_powder_snow_with_leather_boots",
            "Is It a Plane?": "adventure/spyglass_at_dragon",
            "Very Very Frightening": "adventure/very_very_frightening",
            "Sniper Duel": "adventure/sniper_duel",
            "Bullseye": "adventure/bullseye",
            "Husbandry": "husbandry/root",
            "Bee Our Guest": "husbandry/safely_harvest_honey",
            "The Parrots and the Bats": "husbandry/breed_an_animal",
            "You've Got a Friend in Me": "husbandry/allay_deliver_item_to_player",
            "Whatever Floats Your Goat!": "husbandry/ride_a_boat_with_a_goat",
            "Best Friends Forever": "husbandry/tame_an_animal",
            "Glow and Behold!": "husbandry/make_a_sign_glow",
            "Fishy Business": "husbandry/fishy_business",
            "Total Beelocation": "husbandry/silk_touch_nest",
            "Bukkit Bukkit": "husbandry/tadpole_in_a_bucket",
            "Smells Interesting": "husbandry/obtain_sniffer_egg",
            "A Seedy Place": "husbandry/plant_seed",
            "Wax On": "husbandry/wax_on",
            "Two by Two": "husbandry/bred_all_animals",
            "Birthday Song": "husbandry/allay_deliver_cake_to_note_block",
            "A Complete Catalogue": "husbandry/complete_catalogue",
            "Tactical Fishing": "husbandry/tactical_fishing",
            "When the Squad Hops into Town": "husbandry/leash_all_frog_variants",
            "Little Sniffs": "husbandry/feed_snifflet",
            "A Balanced Diet": "husbandry/balanced_diet",
            "Serious Dedication": "husbandry/obtain_netherite_hoe",
            "Wax Off": "husbandry/wax_off",
            "The Cutest Predator": "husbandry/axolotl_in_a_bucket",
            "With Our Powers Combined!": "husbandry/froglights",
            "Planting the Past": "husbandry/plant_any_sniffer_seed",
            "The Healing Power of Friendship!": "husbandry/kill_axolotl_target",
        }

    def conquista2mc(strConquista):
        return dict[strConquista]