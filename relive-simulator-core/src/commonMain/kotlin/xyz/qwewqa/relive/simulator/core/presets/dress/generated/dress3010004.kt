package xyz.qwewqa.relive.simulator.core.presets.dress.generated

import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.Attribute
import xyz.qwewqa.relive.simulator.core.stage.actor.StatData
import xyz.qwewqa.relive.simulator.core.stage.dress.ActParameters
import xyz.qwewqa.relive.simulator.core.stage.dress.PartialDressBlueprint
import xyz.qwewqa.relive.simulator.core.stage.dress.StatBoost
import xyz.qwewqa.relive.simulator.core.stage.dress.StatBoostType
import xyz.qwewqa.relive.simulator.stage.character.Character
import xyz.qwewqa.relive.simulator.stage.character.DamageType
import xyz.qwewqa.relive.simulator.stage.character.Position

val dress3010004 = PartialDressBlueprint(
  id = 3010004,
  name = "イースターバニー",
  baseRarity = 4,
  character = Character.Aruru,
  attribute = Attribute.Snow,
  damageType = DamageType.Normal,
  position = Position.Middle,
  positionValue = 24050,
  stats = StatData(
    hp = 988,
    actPower = 166,
    normalDefense = 68,
    specialDefense = 69,
    agility = 168,
    dexterity = 5,
    critical = 50,
    accuracy = 0,
    evasion = 0,
  ),
  growthStats = StatData(
    hp = 32560,
    actPower = 2750,
    normalDefense = 1130,
    specialDefense = 1140,
    agility = 2770,
  ),
  actParameters = mapOf(
    ActType.Act1 to listOf(
      ActParameters(
        values = listOf(88, 92, 96, 101, 105),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
    ),
    ActType.Act2 to listOf(
      ActParameters(
        values = listOf(93, 98, 102, 107, 112),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(20, 20, 20, 20, 20),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
    ),
    ActType.Act3 to listOf(
      ActParameters(
        values = listOf(132, 138, 145, 151, 158),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(7, 8, 9, 10, 11),
        times = listOf(3, 3, 3, 3, 3),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
    ),
    ActType.ClimaxAct to listOf(
      ActParameters(
        values = listOf(178, 187, 196, 205, 214),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(2, 2, 2, 2, 2),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
      ),
    ),
  ),
  autoSkillRanks = listOf(1, 4, 9, null),
  autoSkillPanels = listOf(0, 0, 5, 0),
  rankPanels = listOf(
    listOf(
      StatBoost(StatBoostType.Hp, 1),
      StatBoost(StatBoostType.ActPower, 1),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.NormalDefense, 1),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.SpecialDefense, 1),
    ),
    listOf(
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.Agility, 7),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 3),
      StatBoost(StatBoostType.Act1Level, 0),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 3),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.Hp, 3),
      StatBoost(StatBoostType.ActPower, 3),
      StatBoost(StatBoostType.SpecialDefense, 5),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.Hp, 4),
    ),
    listOf(
      StatBoost(StatBoostType.SpecialDefense, 3),
      StatBoost(StatBoostType.NormalDefense, 7),
      StatBoost(StatBoostType.NormalDefense, 3),
      StatBoost(StatBoostType.Agility, 8),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 4),
      StatBoost(StatBoostType.Hp, 4),
      StatBoost(StatBoostType.Act1Level, 0),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 4),
      StatBoost(StatBoostType.Act1Level, 0),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.SpecialDefense, 8),
      StatBoost(StatBoostType.ActPower, 5),
      StatBoost(StatBoostType.SpecialDefense, 5),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.Hp, 5),
    ),
    listOf(
      StatBoost(StatBoostType.Hp, 5),
      StatBoost(StatBoostType.NormalDefense, 8),
      StatBoost(StatBoostType.SpecialDefense, 5),
      StatBoost(StatBoostType.Agility, 9),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 5),
      StatBoost(StatBoostType.NormalDefense, 8),
      StatBoost(StatBoostType.NormalDefense, 4),
    ),
    listOf(
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.Agility, 11),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.Act1Level, 0),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.SpecialDefense, 6),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
    ),
  ),
  friendshipPanels = listOf(
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 1),
      StatBoost(StatBoostType.Hp, 1),
      StatBoost(StatBoostType.NormalDefense, 1),
      StatBoost(StatBoostType.SpecialDefense, 1),
      StatBoost(StatBoostType.Agility, 1),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 1),
      StatBoost(StatBoostType.Hp, 1),
      StatBoost(StatBoostType.NormalDefense, 1),
      StatBoost(StatBoostType.SpecialDefense, 1),
      StatBoost(StatBoostType.Agility, 1),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 1),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
  ),
  remakeParameters = listOf(
    StatData(
      hp = 10200,
      actPower = 10200,
      normalDefense = 450,
      specialDefense = 150,
      agility = 180,
    ),
    StatData(
      hp = 17000,
      actPower = 17000,
      normalDefense = 750,
      specialDefense = 250,
      agility = 300,
    ),
    StatData(
      hp = 27200,
      actPower = 27200,
      normalDefense = 1200,
      specialDefense = 400,
      agility = 480,
    ),
    StatData(
      hp = 34000,
      actPower = 34000,
      normalDefense = 1500,
      specialDefense = 500,
      agility = 600,
    ),
  ),
)