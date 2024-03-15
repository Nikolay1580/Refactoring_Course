package jetbrains.refactoring.course.moving.car

class Car(private val gearsNumber: Int) {
    private var engineStarted: Boolean = false
    private var gear: Int = 0
        set(value) {
            if (value > gearsNumber || value < 0)
                throw IllegalStateException()
            field = value
        }

    public fun start() {
        this.engineStarted = true
        this.gear = 1
    }

    public fun stop() {
        this.gear = 0
        this.engineStarted = false
    }
}
