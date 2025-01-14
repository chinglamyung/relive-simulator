package xyz.qwewqa.relive.simulator.core.presets.dress.back.snow

import xyz.qwewqa.relive.simulator.stage.character.Character
import xyz.qwewqa.relive.simulator.stage.character.DamageType
import xyz.qwewqa.relive.simulator.stage.character.Position
import xyz.qwewqa.relive.simulator.core.presets.condition.SnowOnlyCondition
import xyz.qwewqa.relive.simulator.core.presets.condition.SpecialDamageOnlyCondition
import xyz.qwewqa.relive.simulator.core.presets.condition.TamaoOnlyCondition
import xyz.qwewqa.relive.simulator.core.presets.dress.generated.dress2040017
import xyz.qwewqa.relive.simulator.core.stage.Act
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.Attribute
import xyz.qwewqa.relive.simulator.core.stage.actor.actsOf
import xyz.qwewqa.relive.simulator.core.stage.actor.defaultDressStats
import xyz.qwewqa.relive.simulator.core.stage.autoskill.new
import xyz.qwewqa.relive.simulator.core.stage.buff.*
import xyz.qwewqa.relive.simulator.core.stage.dress.Dress
import xyz.qwewqa.relive.simulator.core.stage.dress.blueprint
import xyz.qwewqa.relive.simulator.core.stage.passive.*

val StageGirlRui = dress2040017(
    name = "Stage Girl Rui",
    acts = listOf(
        ActType.Act1.blueprint("Ardent Slash", 2) {
            Act {
                targetBack().act {
                    attack(
                        modifier = values1,
                        hitCount = 1,
                    )
                }
            }
        },
        ActType.Act2.blueprint("Resolute Blade", 2) {
            Act {
                targetBack().act {
                    attack(
                        modifier = values1,
                        hitCount = 2,
                        bonusMultiplier = 150,
                        bonusCondition = SpecialDamageOnlyCondition,
                    )
                    applyBuff(
                        ActPowerDownBuff,
                        value = values2,
                        turns = times2,
                    )
                    applyBuff(
                        NormalDefenseDownBuff,
                        value = values3,
                        turns = times3,
                    )
                }
            }
        },
        ActType.Act3.blueprint("Strike of Determination", 2) {
            Act {
                targetBack().act {
                    attack(
                        modifier = values1,
                        hitCount = 1,
                    )
                }
                targetAllyAoe().act {
                    applyBuff(
                        DexterityUpBuff,
                        value = values2,
                        turns = times2,
                    )
                    applyBuff(
                        ApDownBuff,
                        turns = times3,
                    )
                }
            }
        },
        ActType.ClimaxAct.blueprint("My life is on this stage!", 2) {
            Act {
                targetAoe().act {
                    dispelTimed(BuffCategory.Positive)
                }
                targetAnyRandom(10).act {
                    attack(
                        modifier = values2,
                        hitCount = 10,
                    )

                    applyBuff(
                        StopBuff,
                        turns = 1,
                        chance = 33,
                    )
                }
            }
        }
    ),
    autoSkills = listOf(
        listOf(
            TeamEffectiveDamageDealtUpBuffPassive.new(20, time = 3),
        ),
        listOf(
            TeamCriticalUpBuffPassive.new(20, time = 3),
        ),
        listOf(
            TeamBrillianceRecoveryPassive.new(20) + TamaoOnlyCondition,
        )
    ),
    unitSkill = ActCritical50UnitSkill + SnowOnlyCondition,
)
