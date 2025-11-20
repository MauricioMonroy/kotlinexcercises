package types_and_data_structures.collections.list.basic_lists

fun main() {
    // Output with joinToString
    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    println(southernCross.joinToString(" | "))   //  Acrux | Gacrux | Imai | Mimosa

    // Working with multiple lists
    val southernCross2 = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    val stars = mutableListOf("Ginan", "Mu Crucis")

    val newList = southernCross2 + stars
    println(newList.joinToString())    //  Acrux, Gacrux, Imai, Mimosa, Ginan, Mu Crucis

    // Comparing mutable lists
    val firstList = mutableListOf("result", "is", "true")
    val secondList = mutableListOf("result", "is", "true")
    val thirdList = mutableListOf("result")

    println(firstList == secondList)  //  true
    println(firstList == thirdList)   //  false
    println(secondList != thirdList)  //  true
}