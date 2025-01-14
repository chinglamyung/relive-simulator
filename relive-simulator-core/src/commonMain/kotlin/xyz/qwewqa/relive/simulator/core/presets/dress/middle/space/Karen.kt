package xyz.qwewqa.relive.simulator.core.presets.dress.middle.space

import xyz.qwewqa.relive.simulator.core.presets.condition.SpaceOnlyCondition
import xyz.qwewqa.relive.simulator.core.presets.dress.generated.dress1010014
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
import xyz.qwewqa.relive.simulator.stage.character.Character
import xyz.qwewqa.relive.simulator.stage.character.DamageType
import xyz.qwewqa.relive.simulator.stage.character.Position

val WheelOfFortuneKaren = dress1010014(
    name = "Wheel of Fortune Karen",
    acts = listOf(
        ActType.Act1.blueprint("Slash of Brilliance", 2) {
            Act {
                targetFront().act {
                    attack(
                        modifier = values1,
                        hitCount = 1,
                    )
                }
                targetSelf().act {
                    addBrilliance(values2)
                }
            }
        },
        ActType.Act2.blueprint("Purity of Heaven", 2) {
            Act {
                targetFront().act {
                    attack(
                        modifier = values1,
                        hitCount = 2,
                    )
                }
                targetAoe().act {
                    dispelTimed(BuffCategory.Positive)
                }
            }
        },
        ActType.Act3.blueprint("Destiny Guidance", 3) {
            Act {
                targetAoe().act {
                    attack(
                        modifier = values1,
                        hitCount = 3,
                    )
                }
                targetAllyAoe().act {
                    applyBuff(
                        effect = DexterityUpBuff,
                        value = values2,
                        turns = times2,
                    )
                    applyBuff(
                        effect = EffectiveDamageDealtUpBuff,
                        value = values3,
                        turns = times3,
                    )
                }
            }
        },
        ActType.ClimaxAct.blueprint("Destiny's End", 2) {
            Act {
                focus {
                    targetFront(3).act {
                        applyBuff(
                            effect = SpecialDefenseDownBuff,
                            value = values1,
                            turns = times1,
                        )
                        attack(
                            modifier = values2,
                            hitCount = 4,
                        )
                    }
                }
            }
        }
    ),
    autoSkills = listOf(
        listOf(
            TeamStunResistanceBuffPassive.new(value = 100, time = 6),
        ),
        listOf(
            TeamDexterityUpBuffPassive.new(10, 3),
        ),
        listOf(
            SelfClimaxDamageUpBuffPassive.new(10),
        )
    ),
    unitSkill = ActCritical50UnitSkill + SpaceOnlyCondition,
)
