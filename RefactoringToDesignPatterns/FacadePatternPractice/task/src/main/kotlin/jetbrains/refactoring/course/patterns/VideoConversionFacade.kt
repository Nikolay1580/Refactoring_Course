package jetbrains.refactoring.course.patterns

// TODO

class VideoConversionFacade() {
    private val videoLoader = VideoLoader()
    private val videoProcessor = VideoProcessor()
    private val videoEncoder = VideoEncoder()
    private val videoSaver = VideoSaver()

    public fun getVideoLoader() = this.videoLoader
    public fun getVideoProcessor() = this.videoProcessor
    public fun getVideoEncoder() = this.videoEncoder
    public fun getVideoSaver() = this.videoSaver



}