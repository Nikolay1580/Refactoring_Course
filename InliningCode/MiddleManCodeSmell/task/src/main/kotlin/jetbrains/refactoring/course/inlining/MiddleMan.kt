// DataProvider class
class DataProvider {
    fun fetchData(): String {
        // Some complex logic to fetch data from a remote server
        return "Data from the server"
    }
}

// Client class directly using DataProvider
class Client {
    fun processData(): String {
        val dataProvider = DataProvider() // Inline the DataProvider object directly
        return dataProvider.fetchData() // Inline the fetchData method directly
    }
}

fun main() {
    val client = Client()
    println(client.processData()) // Output: Data from the server
}
