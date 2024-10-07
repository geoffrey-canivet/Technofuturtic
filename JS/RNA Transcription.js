const toRna = (lettre) => {
    lettre = lettre.split('')
    let tabNewLettre = [];
    lettre.forEach(element => {
        switch (element) {
            case 'G':
                tabNewLettre.push("C") 
                break;
            case 'C':
                tabNewLettre.push("G") 
                break;
            case 'T':
                tabNewLettre.push("A") 
                break;
            case 'A':
                tabNewLettre.push("U") 
                break;
            default:
                tabNewLettre.push("")
                break;
        }
        
    });
    console.log(tabNewLettre.join("")) 
};

toRna('ACGTGGTCTTAA')


const reverseString = (mot) => {
    return mot.split("").reverse().join("")
  };

  reverseString('geoffrey')

  const isLeap = (date) => {
    if (date % 4 === 0) {
        if (date % 100 === 0) {
            if (date % 400 === 0) {
                return true
            } else {
                return false
            }
        } else {
            return true
        }
    } else {
        return false
    }
};


  isLeap(1997)