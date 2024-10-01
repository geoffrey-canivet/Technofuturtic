// • Chaîne : « ma formation javascript »
let chaine = "ma formation javascript";

// • Avec la chaîne ci-dessus :
// – Retourner la position de « ma »
console.log(chaine.indexOf("fo"))

// – Indiquer l’indice de la lettre « p »
console.log(chaine.indexOf("p"))

// – Retrouver la lettre située à l’indice 21
console.log(chaine.charAt(21))

// – Remplacer « javascript » par « Java »
console.log(chaine.replace("javascript", 'Java'))

// – Découper la chaîne avec le délimiteur «  » (espace)
console.log(chaine.split(""))

// – Inverser la chaîne de caractères (+ difficile) :
// « ma formation javascript » → « tpircsavaj noitamrof am »
console.log(chaine.split("").reverse().join(""));

//Créez un tableau vide nommé "tableauVide".
let tableauVide = [];

//Créez un tableau nommé "tableauDeNombres" contenant les nombres 1, 2, 3, 4 et 5.
let tableauDeNombres = [1, 2, 3, 4, 5]

//Ajoutez le nombre 6 au tableau "tableauDeNombres".
tableauDeNombres.push(6)

//Récupérez et affichez le troisième élément du tableau "tableauDeNombres".
tableauDeNombres[2]

//Modifiez le deuxième élément du tableau "tableauDeNombres" pour qu'il soit égal à 22.
tableauDeNombres.splice(1,1,22)

//Supprimez le dernier élément du tableau "tableauDeNombres".
tableauDeNombres.pop()
//Créez un tableau nommé "tableauDeMots" contenant les mots "Bonjour", "Salut", "Ciao", "Hola" et "Hello".
let tableauDeMots = ["Bonjour", "Salut", "Ciao", "Hola", "Hello"]

//Affichez le nombre total d'éléments du tableau "tableauDeMots".
tableauDeMots.length

//Recherchez le mot "Ciao" dans le tableau "tableauDeMots".
console.log(tableauDeMots.indexOf("Ciao"))

//Triez les mots du tableau "tableauDeMots" dans l'ordre alphabétique.
console.log(tableauDeMots.sort())

//Créez un tableau nommé "tableauDePrix" Ajoutez des nombre compris entre 0 et 100
let tableauDePrix = [60, 10, 0, 30, 40, 50, 20]

//Triez le tableau "tableauDePrix" par ordre croissant de prix.
console.log(tableauDePrix.sort(function(a,b){return a - b}))

//Calculez la somme des prix dans le tableau "tableauDePrix".
let somme = 0
for (let i = 0; i < tableauDePrix.length; i++) {
    somme += tableauDePrix[i]
}
console.log(somme)

//Créez un tableau nommé "tableauDeNombres2" contenant 10 nombres aléatoires compris entre 1 et 100.
let tableauDeNombres2 = []
for (let i = 0; i < 10; i++){
    tableauDeNombres2.push(Math.floor(Math.random() * 100) + 1)
}
console.log(tableauDeNombres2)

//Récupérez et affichez le plus grand nombre du tableau "tableauDeNombres2".
console.log(Math.max(...tableauDeNombres2))

//Récupérez et affichez le plus petit nombre du tableau "tableauDeNombres2".
console.log(Math.min(...tableauDeNombres2))

//Calculez la moyenne des nombres du tableau "tableauDeNombres2".
let somme2 = 0
let moyenne = 0
for (let i = 0; i < tableauDeNombres2.length; i++) {
    somme2 += tableauDeNombres2[i]
}
moyenne = somme2 / tableauDeNombres2.length;
console.log(moyenne)

//Déterminez le nombre de fois où le nombre 50 apparaît dans le tableau "tableauDeNombres2".
let nb50 = 0;

for (let i = 0; i < tableauDeNombres2.length; i++) {
    if (tableauDeNombres2[i] == 50) {
        nb50++
    }
}
console.log(nb50)

//Retournez le tableau "tableauDeNombres2" inversé.
console.log(tableauDeNombres2.reverse())

//Retournez un tableau contenant uniquement les nombres impairs du tableau "tableauDeNombres2".
let tabImpaire = []
for (let i = 0; i < tableauDeNombres2.length; i++) {
    if (tableauDeNombres2[i] % 2 !== 0) {
        tabImpaire.push(tableauDeNombres2[i])
    }
}
console.log(tabImpaire)
//Créez un tableau nommé "tableauDeMots2" contenant des mots aléatoires. Ensuite, triez ce tableau par ordre alphabétique.
const tableauDeMots2 = ['un', 'deux', "trois", "quatre", "cinq", "six", "motdeplusde5lettres"];
console.log(tableauDeMots2.sort())

//Retournez un tableau contenant uniquement les mots de plus de 5 caractères dans le tableau "tableauDeMots2".
let newTab = []
for (mot in tableauDeMots2){
    console.log(tableauDeMots2[mot])
    if (tableauDeMots2[mot].length > 5) {
        newTab.push(tableauDeMots2[mot])
    }
}
console.log(newTab)

//Transformez le tableau "tableauDeMots2" en une chaîne de caractères contenant tous les mots, séparés par une virgule et un espace.
console.log(tableauDeMots2.join(", "))

// Calcul de la TVA Écrire un programme qui : 
// 1. Demande à l’utilisateur un prix unitaire hors taxe d’un livre 
// 2. Demande à l’utilisateur la quantité de livre 
// 3. Calcule et affiche le prix total TTC de la commande, en utilisant une TVA de 21% Pour interagir avec 
// l’utilisateur, vous utiliserez les fonctions d’entrée/sortie prompt() et alert(). 
// let userInput = prompt("Entrez le prix unitaire hors taxe d’un livre:")
// let prixAvecTVA = (21 / 100) * userInput;
// alert((parseInt(userInput) + prixAvecTVA))

// Utilisez l’objet Date et des structures conditionnelles, écrivez un programme qui affiche le jour de la semaine. 
// Exemple : « Bonjour, nous sommes lundi! »
let jour = new Date;
switch (jour.getDay()) {
    case 0:
        
        break;
        case 0:
            console.log("Bonjour, nous sommes dimanche!")
        break;
        case 1:
            console.log("Bonjour, nous sommes lundi!")
        break;
        case 2:
            console.log("Bonjour, nous sommes mardi!")
        break;
        case 3:
            console.log("Bonjour, nous sommes mercredi!")
        break;
        case 4:
            console.log("Bonjour, nous sommes jeudi!")
        break;
        case 5:
            console.log("Bonjour, nous sommes vendredi!")
        break;
        case 6:
            console.log("Bonjour, nous sommes smedi!")
        break;
    default:
        console.log("Erreur")
        break;
}

// Réalisez un programme qui permet d’afficher, dans la console, la structure suivante à l’aide d’une boucle :
let lettre = "A"
for (let i = 1; i <= 10; i++) {
    console.log(lettre.repeat(i));
}

// Créez une fonction inverser(chaine) qui effectuera une inversion des caractères d’une chaîne et affichera le résultat en console et en alerte.
const stringRevers = (chaine) => {
    console.log(chaine.split("").reverse().join(""))

}
stringRevers("je suis une chaine de carractère")

