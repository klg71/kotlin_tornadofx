package de.klg71.tornado

import tornadofx.App
import tornadofx.View
import tornadofx.hbox
import tornadofx.label


// Define application with main View `Main`
class MainApp1 : App(Main::class)

// Define the view to display
class Main1 : View() {

    // override the root view with our container with the label within
    override val root = hbox {
        // use the tornado kotlin dsl to add a label and set the text
        label {
            text = "Hello World"
        }
    }
}

