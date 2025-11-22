package com.sailingdocklevels;

import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@Getter
enum DockingPointLocation
{
    PORT_SARIM("Port Sarim", 1, new WorldPoint(3051, 3192, 0)),
    THE_PANDEMONIUM("The Pandemonium", 1, new WorldPoint(3070, 2986, 0)),
    LANDS_END("Land's End", 5, new WorldPoint(1507, 3402, 0)),
    HOSIDIUS("Hosidius", 5, new WorldPoint(1727, 3452, 0)),
    MUSA_POINT("Musa Point", 10, new WorldPoint(2961, 3147, 0)),
    PORT_PISCARILLIUS("Port Piscarillius", 15, new WorldPoint(1846, 3687, 0)),
    RIMMINGTON("Rimmington", 18, new WorldPoint(2906, 3226, 0)),
    CATHERBY("Catherby", 20, new WorldPoint(2797, 3412, 0)),
    BRIMHAVEN("Brimhaven", 25, new WorldPoint(2758, 3229, 0)),
    ARDOUGNE("Ardougne", 28, new WorldPoint(2672, 3265, 0)),
    PORT_KHAZARD("Port Khazard", 30, new WorldPoint(2686, 3161, 0)),
    WITCHAVEN("Witchaven", 34, new WorldPoint(2747, 3304, 0)),
    ENTRANA("Entrana", 36, new WorldPoint(2879, 3335, 0)),
    CIVITAS_ILLA_FORTIS("Civitas illa Fortis", 38, new WorldPoint(1775, 3141, 0)),
    CORSAIR_COVE("Corsair Cove", 40, new WorldPoint(2580, 2843, 0)),
    DOGNOSE_ISLAND("Dognose Island", 40, new WorldPoint(3062, 2639, 0)),
    CAIRN_ISLE("Cairn Isle", 42, new WorldPoint(2750, 2951, 0)),
    CHINCHOMPA_ISLAND("Chinchompa Island", 42, new WorldPoint(1893, 3429, 0)),
    SUNSET_COAST("Sunset Coast", 44, new WorldPoint(1512, 2975, 0)),
    REMOTE_ISLAND("Remote Island", 45, new WorldPoint(2972, 2603, 0)),
    THE_SUMMER_SHORE("The Summer Shore", 45, new WorldPoint(3175, 2367, 0)),
    THE_LITTLE_PEARL("The Little Pearl", 45, new WorldPoint(3355, 2216, 0)),
    ALDARIN("Aldarin", 46, new WorldPoint(1453, 2970, 0)),
    VATRACHOS_ISLAND("Vatrachos Island", 46, new WorldPoint(1873, 2985, 0)),
    THE_ONYX_CREST("The Onyx Crest", 47, new WorldPoint(2998, 2288, 0)),
    RUINS_OF_UNKAH("Ruins of Unkah", 48, new WorldPoint(3144, 2824, 0)),
    SHIMMERING_ATOLL("Shimmering Atoll", 49, new WorldPoint(1558, 2771, 0)),
    VOID_KNIGHTS_OUTPOST("Void Knights' Outpost", 50, new WorldPoint(2652, 2678, 0)),
    PORT_ROBERTS("Port Roberts", 50, new WorldPoint(1861, 3306, 0)),
    ANGLERS_RETREAT("Anglers' Retreat", 51, new WorldPoint(2468, 2721, 0)),
    MINOTAURS_REST("Minotaurs' Rest", 54, new WorldPoint(1959, 3117, 0)),
    ISLE_OF_SOULS("Isle of Souls", 55, new WorldPoint(2283, 2823, 0)),
    ISLE_OF_BONES("Isle of Bones", 56, new WorldPoint(2533, 2531, 0)),
    LAGUNA_AURORAE("Laguna Aurorae", 58, new WorldPoint(1203, 2733, 0)),
    CHARRED_ISLAND("Charred Island", 60, new WorldPoint(2661, 2395, 0)),
    TEAR_OF_THE_SOUL("Tear of the Soul", 61, new WorldPoint(2319, 2774, 0)),
    RELLEKKA("Rellekka", 62, new WorldPoint(2631, 3705, 0)),
    WINTUMBER_ISLAND("Wintumber Island", 63, new WorldPoint(2059, 2606, 0)),
    THE_CROWN_JEWEL("The Crown Jewel", 64, new WorldPoint(1766, 2659, 0)),
    ETCETERIA("Etceteria", 65, new WorldPoint(2612, 3840, 0)),
    PORT_TYRAS("Port Tyras", 66, new WorldPoint(2145, 3120, 0)),
    LLEDRITH_ISLAND("Lledrith Island", 66, new WorldPoint(2098, 3188, 0)),
    DEEPFIN_POINT("Deepfin Point", 67, new WorldPoint(1924, 2758, 0)),
    JATIZSO("Jatizso", 68, new WorldPoint(2413, 3780, 0)),
    NEITIZNOT("Neitiznot", 68, new WorldPoint(2309, 3783, 0)),
    RAINBOWS_END("Rainbow's End", 69, new WorldPoint(2345, 2270, 0)),
    PRIFDDINAS("Prifddinas", 70, new WorldPoint(2159, 3324, 0)),
    SUNBLEAK_ISLAND("Sunbleak Island", 72, new WorldPoint(2190, 2327, 0)),
    YNYSDAIL("Ynysdail", 73, new WorldPoint(2223, 3466, 0)),
    WATERBIRTH_ISLAND("Waterbirth Island", 74, new WorldPoint(2544, 3765, 0)),
    PISCATORIS("Piscatoris", 75, new WorldPoint(2304, 3690, 0)),
    LUNAR_ISLE("Lunar Isle", 76, new WorldPoint(2152, 3880, 0)),
    BUCCANEERS_HAVEN("Buccaneers' Haven", 76, new WorldPoint(2081, 3690, 0)),
    DRUMSTICK_ISLE("Drumstick Isle", 79, new WorldPoint(2151, 3530, 0)),
    WEISS("Weiss", 80, new WorldPoint(2861, 3972, 0)),
    BRITTLE_ISLE("Brittle Isle", 81, new WorldPoint(1955, 4056, 0)),
    GRIMSTONE("Grimstone", 87, new WorldPoint(2928, 4056, 0));

    private final String name;
    private final int sailingLevel;
    private final WorldPoint location;

    DockingPointLocation(String name, int sailingLevel, WorldPoint location)
    {
        this.name = name;
        this.sailingLevel = sailingLevel;
        this.location = location;
    }

    public String getTooltip()
    {
        return name + " - Level " + sailingLevel;
    }
}