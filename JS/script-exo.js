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


//Retournez le tableau "tableauDeNombres2" inversé.
console.log(tableauDeNombres2.reverse())

//Retournez un tableau contenant uniquement les nombres impairs du tableau "tableauDeNombres2".


//Créez un tableau nommé "tableauDeMots2" contenant des mots aléatoires. Ensuite, triez ce tableau par ordre alphabétique.


//Retournez un tableau contenant uniquement les mots de plus de 5 caractères dans le tableau "tableauDeMots2".


//Transformez le tableau "tableauDeMots2" en une chaîne de caractères contenant tous les mots, séparés par une virgule et un espace.
