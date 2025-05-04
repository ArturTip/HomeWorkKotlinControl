import org.junit.Test

import org.junit.Assert.*
 class TaskTwoKtTest {

@Test
 fun commissnVisa() {
 val typeCard = "Visa"
 val transfer = 100_000
 val previous = 0

 val result = commissn(typeCard,transfer,previous)
 assertEquals(750, result)

 }
}