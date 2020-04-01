package practice.kotlin.com.logoactivity

import android.content.Intent

class SharedData {
    val allModeSenderIntent = Intent()
    val allModeProgressServiceIntent = Intent()
    var isConnected: Boolean = false
    var threadCount: Int = 0

    val selectedModeSenderIntent = Intent()
    val selectedModeProgressServiceIntent = Intent()
    var allModeFileCount: Int = 0
    var allModeTotalFileCount: Int = 0

    var selectedModeFileCount: Int = 0
    var selectedModeTotalFileCount: Int = 0
    
    
    //추후 생성할거임
    //var selectedImageList = ArrayList<SelectedImageData>()

    companion object {
        val instance = SharedData()
    }
}