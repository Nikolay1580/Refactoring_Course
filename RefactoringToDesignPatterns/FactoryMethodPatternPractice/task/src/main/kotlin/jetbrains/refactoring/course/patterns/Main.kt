package jetbrains.refactoring.course.patterns

fun main(args: Array<String>) {
    val transportName = args[0]
    val transport = TransportationServiceFactory().getTransportation(transportName)
    val driveMessage = transport.drive()
    println(driveMessage)
}
