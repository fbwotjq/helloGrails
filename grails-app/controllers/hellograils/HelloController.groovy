package hellograils

class HelloController {

    def index() {
        render "hello grails"
    }

    def random() {

        def staticAuthor = "fbwotjq"
        def staticContent = "Real Programmers don't eat much quiche"

        [ author: staticAuthor, content: staticContent]

    }

}
