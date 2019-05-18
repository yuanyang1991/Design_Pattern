import store.CAPizzaStore
import store.NewYorkPizzaStore

fun main() {

    //点一份纽约风味的芝士批萨
    val newyorkPizzaStore : NewYorkPizzaStore = NewYorkPizzaStore()
    newyorkPizzaStore.order("chess")


    //点一份加州风味的蔬菜批萨
    val caPizzaStore : CAPizzaStore = CAPizzaStore()
    caPizzaStore.order("vege")

}