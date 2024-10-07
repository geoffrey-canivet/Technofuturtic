const isArmstrongNumber = (num) => {
    let result = 0;
    const verifNum = num.toString().split(""); // Sépare les chiffres du nombre

    for (const element of verifNum) {
        result += Number(element) ** verifNum.length; // Convertir chaque chiffre en nombre et calculer sa puissance
    }

    if (result === num) {
        console.log(true);
        return true;
    } else {
        console.log(false);
        return false;
    }
};



isArmstrongNumber(9475)