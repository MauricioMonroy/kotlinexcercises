package constructors

class News {
    var title: String = "-"
    var text: String = "-"
    var tag: String = "-"

    constructor(title: String, text: String) {
        this.title = title
        this.text = text
        this.tag = "no tags"
    }
}

val news = News("Title", "Text") // Example of creating an instance of the News class