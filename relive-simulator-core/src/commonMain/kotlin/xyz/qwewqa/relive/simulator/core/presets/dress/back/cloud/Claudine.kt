package xyz.qwewqa.relive.simulator.core.presets.dress.back.cloud

import xyz.qwewqa.relive.simulator.core.presets.condition.CloudOnlyCondition
import xyz.qwewqa.relive.simulator.core.presets.dress.generated.dress1040017
import xyz.qwewqa.relive.simulator.core.stage.Act
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.autoskill.new
import xyz.qwewqa.relive.simulator.core.stage.buff.BuffCategory
import xyz.qwewqa.relive.simulator.core.stage.buff.MarkBuff
import xyz.qwewqa.relive.simulator.core.stage.buff.NormalReflectBuff
import xyz.qwewqa.relive.simulator.core.stage.buff.SpecialReflectBuff
import xyz.qwewqa.relive.simulator.core.stage.dress.blueprint
import xyz.qwewqa.relive.simulator.core.stage.passive.ActCritical30UnitSkillStageGirl
import xyz.qwewqa.relive.simulator.core.stage.passive.TeamBurnResistanceBuffPassive
import xyz.qwewqa.relive.simulator.core.stage.passive.TeamConfusionResistanceBuffPassive
import xyz.qwewqa.relive.simulator.core.stage.passive.TeamStunResistanceBuffPassive
import xyz.qwewqa.relive.simulator.core.stage.stageeffect.WeAreOnTheStageCloud

val StageGirlClaudine = dress1040017(
    name = "Stage Girl Claudine",
    acts = listOf(
        ActType.Act1.blueprint("Marked Slash", 2) {
            Act {
                targetFront().act {
                    attack(
                        modifier = values1,
                        hitCount = 1,
                    )
                    applyBuff(
                        effect = MarkBuff,
                        turns = times2,
                    )
                }
            }
        },
        ActType.Act2.blueprint("Purifying Slash", 2) {
            Act {
                targetFront().act {
                    attack(
                        modifier = values1,
                        hitCount = 1,
                    )
                }
                targetAllyFront(3).act {
                    dispelTimed(BuffCategory.Negative)
                }
            }
        },
        ActType.Act3.blueprint("Synchro of Brilliance", 2) {
            Act {
                targetFront().act {
                    attack(
                        modifier = values1,
                        hitCount = 1,
                    )
                }
                targetAllyAoe().act {
                    addBrilliance(values2)
                }
            }
        },
        ActType.ClimaxAct.blueprint("C'est moi! la star!", 1) {
            Act {
                targetFront().act {
                    dispelTimed(BuffCategory.Positive)
                    attack(
                        modifier = values2,
                        hitCount = 3,
                    )
                }
                targetAllyAoe().act {
                    applyBuff(
                        effect = NormalReflectBuff,
                        value = values3,
                        turns = times3,
                    )
                    applyBuff(
                        effect = SpecialReflectBuff,
                        value = values4,
                        turns = times4,
                    )
                }
                applyAllyStageEffect(WeAreOnTheStageCloud, 6)
            }
        }
    ),
    autoSkills = listOf(
        listOf(
            TeamConfusionResistanceBuffPassive.new(100, 3),
        ),
        listOf(
            TeamBurnResistanceBuffPassive.new(100, 3),
        ),
        listOf(
            TeamStunResistanceBuffPassive.new(100, 3),
        ),
    ),
    unitSkill = ActCritical30UnitSkillStageGirl + CloudOnlyCondition,
)
