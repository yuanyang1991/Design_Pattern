package pizza

/**
 * pizza抽象类
 */
abstract class Pizza(val name:String){


    /**
     * 准备阶段
     */
    fun prepare() {
        System.out.println("$name is preparing")
    }

    /**
     * 烘陪阶段
     */
    fun bake() {
        System.out.println("$name is bake")
    }

    /**
     *切块
     */
    fun cut(){
        System.out.println("$name is cut")
    }

    /**
     *
     */
    fun box() {
        System.out.println("$name is box")
    }
}

