enum class Gender { MALE, FEMALE }
data class User(val name: String?, val gender: Gender?)
data class Article(val title: String?, val author: User?)


fun main(args: Array<String>) {
    val white = User("李白", Gender.MALE)
    val wine = Article("将进酒", white)
    val moon = Article("静夜思", white)
    val just = User("杜甫", Gender.MALE)
    val show = Article("望岳", just)

    val run0 = run {
        val set = mutableSetOf(wine)
        set.add(moon)
        set.add(show)
        set
    }
    print("run0 : ")
    println(run0)

    val run = mutableSetOf(wine)
    run.run {
        this.add(moon)
        add(show)
    }
    print("run : ")
    println(run)

    val with = mutableSetOf(wine)
    with(with) {
        this.add(moon)
        add(show)
    }
    print("with : ")
    println(with)


    val apply = mutableSetOf(wine).apply {
        this.add(moon)
        add(show)
    }
    print("apply : ")
    println(apply)

    val also = mutableSetOf(wine).also {
        it.add(moon)
        it.add(show)
    }
    print("also : ")
    println(also)

    val let = mutableSetOf(wine)
    let.let {
        it.add(moon)
        it.add(show)
    }
    print("let : ")
    println(let)

    val takeIf = mutableSetOf(wine).takeIf {
        it.add(moon)
        it.add(show)
        it.size == 3
    }
    print("takeIf : ")
    println(takeIf)

    val takeUnless = mutableSetOf(wine).takeUnless {
        it.add(moon)
        it.add(show)
        it.size != 3
    }
    print("takeUnless : ")
    println(takeUnless)

}
