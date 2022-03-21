fun main() {
    val transferLimitInDayWithCard = 150_000
    val transferLimitInMonthWithCard = 600_000
    val transferLimitInDayVkPayOnce = 15_000
    val transferLimitInMonthVkPayInMonth = 40_000
    val paymentFeePercent = 0.75
    val paymentFeeMinInCash =  35.0
    val amount: Double = 5_000.0

    var fee: Double = if (amount / 100 * paymentFeePercent <= paymentFeeMinInCash) amount - paymentFeeMinInCash
    else amount / 100 * paymentFeePercent
    var feeBeforeConverted = fee * 100
    println("Полученная скидка, в копейках: $feeBeforeConverted ")


}
