const rotate = (str, rot) => {
    const alpha = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"];
    str = str.split("");
    let newStr = [];

    for (let element of str) {
        // Récupérer l'index de la lettre dans l'alphabet (en minuscules)
        let lowerCaseElement = element.toLowerCase();
        let index = alpha.indexOf(lowerCaseElement);

        // Si c'est une lettre valide (présente dans alpha)
        if (index !== -1) {
            // Calculer le nouvel index après rotation, avec modulo pour boucler après 'z'
            let newIndex = (index + rot) % alpha.length;
            // Ajouter la lettre à newStr (respecter la casse d'origine)
            newStr.push(element === element.toUpperCase() ? alpha[newIndex].toUpperCase() : alpha[newIndex]);
        } else {
            // Si le caractère n'est pas une lettre, le conserver tel quel
            newStr.push(element);
        }
    }

    // Retourner la chaîne de caractères après rotation
    return newStr.join("");
};

rotate('OMG', 5)