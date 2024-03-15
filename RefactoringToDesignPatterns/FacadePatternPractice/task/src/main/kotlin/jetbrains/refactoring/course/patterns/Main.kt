package jetbrains.refactoring.course.patterns

fun main(args: Array<String>) {
    val originalVideoName = args[0]
    val processedVideoName = args[1]

    val videoConverter = VideoConversionFacade()



    val video = videoConverter.getVideoLoader().loadVideo(originalVideoName)
    val processedVideo = videoConverter.getVideoProcessor().processVideo(video)
    val encodedVideo = videoConverter.getVideoEncoder().encodeVideo(processedVideo)
    videoConverter.getVideoSaver().saveVideo(encodedVideo, processedVideoName)
}
