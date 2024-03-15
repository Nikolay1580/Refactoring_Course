package jetbrains.refactoring.course.patterns

import jetbrains.refactoring.course.patterns.strategy.BitcoinPayment
import jetbrains.refactoring.course.patterns.strategy.CreditCardPayment
import jetbrains.refactoring.course.patterns.strategy.PayPalPayment
import jetbrains.refactoring.course.patterns.strategy.PaymentStrategy
import java.time.LocalDate

class Order(val totalAmount: Double, val date: LocalDate, val paymentMethod: String) {
    fun processPayment() {
        when (paymentMethod) {
            "Bitcoin" -> BitcoinPayment().processPayment(totalAmount)
            "PayPal" -> PayPalPayment().processPayment(totalAmount)
            "Credit Car" -> CreditCardPayment().processPayment(totalAmount)
        }

    }
}
