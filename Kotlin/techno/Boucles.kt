import java.util.*

fun main() {
//    exo1();
//    exo2();
//    exo3();
    exo4();
}

fun exo1() {
    println("Boucle While")
    var i = 0
    while (i < 3) {
        println(i)
        i++
    }
    println("Boucle Do While")
    var j = 0
    do {
        println(j)
        j++
    } while (j < 3)
    println("Boucle For")
    for (k in 0..2) {
        println(k)
    }
}

fun exo2() {
    val scanner = Scanner(System.`in`)
    val random = Random()
    val randomNumber = random.nextInt(10)

    println(randomNumber)

    var tentative = 5

    do {
        println("Il vous reste $tentative tentatives. Entrez un chiffre entre 1 et 10")
        println("Votre choix: ")

        if(scanner.nextInt() == randomNumber) {
            println("c'est gagné !")
            break
        } else {
            tentative--
        }

    } while (tentative > 0)
    if (tentative == 0) {
        println("perdu")
    }
}

fun exo3() {
    val scanner = Scanner(System.`in`)
    println("Choisissez la taille de la suite:")
    val size = scanner.nextInt()
    val fibonacci = IntArray(size)

    // eviter bug si utilisateur entre 0 ou 1,
    if (size >= 1) {
        fibonacci[0] = 0
    }
    if (size >= 2) {
        fibonacci[1] = 1
    }

    for (i in 2 until size) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }
    println("liste de fibonacci -> " + Arrays.toString(fibonacci));

    // factorialisation un nombre aléatoire de la suite
    val random: Random = Random()
    val randomNb: Int = random.nextInt(size)
    val n = fibonacci[randomNb]
    var factorielle = 1
    println("Nombre aléatoire à factorialiser -> $n")

    // creer tableau de factorielles
    val tabFact = IntArray(n)
    var item = n
    for (i in 0 until n) {
        tabFact[i] = item
        item = item - 1
    }
    println("Facteurs -> " + tabFact.contentToString())

    //multiplier element tableau
    for (i in 0 until tabFact.size) {
        factorielle *= tabFact[i]
    }

    println("factorielle -> $factorielle")
}

fun exo4() {
    var palindrome = "A l'aide de son radar, Anna a repéré un kayak."
    var isPalindromle = 0

    palindrome = palindrome.replace("'", " ");
    palindrome = palindrome.replace(",", "");
    palindrome = palindrome.replace(".", "");
    palindrome = palindrome.replace(" ", ",");

    val tabMots = palindrome.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

    println(tabMots.contentToString())

    val size = tabMots.size

    var index = 0

    for (i in 0 until size) {
        // Transformer le mot en tableau
        var verifTab1: Array<String> = tabMots[i].map { it.toString() }.toTypedArray()
        var verifTab2 = arrayOfNulls<String>(verifTab1.size)
        // inverser le tableau
        for (j in 0 until verifTab1.size) {
            verifTab2[j] = verifTab1[verifTab1.size - 1 - j] // Inverser les index
        }
        val verif1: String = verifTab1.joinToString("")
        val verif2: String = verifTab2.joinToString("")
        // comparer les mots et compte le nb de palindrome
        if (verif1.length >= 3 && verif2.length >= 3) { // Vérifie si les mots ont au moins 3 lettres
            if (verif1 == verif2) {
                isPalindromle += 1
            }
        }
    }

    // ajouter palindrome a la table
    var tabPalindrome = arrayOfNulls<String>(isPalindromle)
    for (i in 0 until size) {
        // Transformer le mot en tableau
        val verifTab1: Array<String> = tabMots[i].map { it.toString() }.toTypedArray()
        val verifTab2 = arrayOfNulls<String>(verifTab1.size)
        // inverser le tableau
        for (j in verifTab1.indices) {
            verifTab2[j] = verifTab1[verifTab1.size - 1 - j] // Inverser les index
        }

        val verif1 = java.lang.String.join("", *verifTab1)
        val verif2 = java.lang.String.join("", *verifTab2)

        // comparer les mots et compte le nb de palindrome
        if (verif1.length >= 3 && verif2.length >= 3) { // debug si mot de moins de 3 lettres
            if (verif1 == verif2) {
                tabPalindrome[index] = verif1
                index++
            }
        }
    }
    println(tabPalindrome.joinToString(", "))


    // trouver le plus long mot
    var result = ""
    for (i in 0 until tabPalindrome.size) {
        if (tabPalindrome[i] != null && tabPalindrome[i]!!.length > result.length) {
            result = tabPalindrome[i]!!
        }
    }

    // si egalité prend le 1e
    println("Le premier plus long palindrome est $result")
}

