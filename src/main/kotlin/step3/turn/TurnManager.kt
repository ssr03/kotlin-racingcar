package step3.turn

interface TurnManager {
    val totalSteps: Int

    val turn: Turn
    fun isFinishOrProceed(): Boolean
}
