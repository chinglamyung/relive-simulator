package xyz.qwewqa.relive.simulator.core.presets.memoir

val memoirs = mapOf("None" to EmptyMemoir) + listOf(
    UnshakableFeelings,
    FriendsAtTheAquarium,
    UrashimaTaroPerformanceFlyer,
    CoStarringWithHatsuneMiku,
    FirstAnnivSeishoMusicAcademy,
    FirstAnnivSiegfeldInstituteOfMusic,
    FirstAnnivRinmeikanGirlsSchool,
    FirstAnnivFrontierSchoolOfArts,
    BandsmansGreeting,
    CrazyMadScientist,
    ToTheWonderfulWorldOfRakugo,
    ThePhantomAndChristine,
    PoolsideIncident,
    MerryChristmas2019,
    PrinceAndPrincessEtude,
    SunsetLabMemBadge,
    ReminiscenceMelody,
    KappoTomoyesPosterGirl,
    UnburnedFlowerUnwitheredFlame,
    XIIHangedManReverse,
    VILoversReverse,
    XVITowerUpright,
    TheGreatYearEndCleanup,
    ConfidantsOnADate,
    SparklingStageChika,
    StretchingHelp,
    ReverberatingVoiceTsubasaMaya,
    ChinatownDelicacies,
).sortedBy { it.name }.sortedBy { it.cutinData.any { cutin -> cutin == null } }.associateBy { it.name }
