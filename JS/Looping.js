function cardTypeCheck(stack, card) {
    let nbCard = 0
    stack.forEach(element => {
        if (element === card ) {
            nbCard++
        }
    });
    return nbCard
}

const cardType = 4;
cardTypeCheck([1, 2, 3, 4, 4], cardType);
// => 2


function determineOddEvenCards(stack, type) {
    let nbCard = 0
    if (type) {
        for (const element of stack) {
            if (element % 2 === 0)
            nbCard++;
        }
    } else {
        for (const element of stack) {
            if (element % 2 !== 0)
            nbCard++;
        }
    }
    return nbCard
}


determineOddEvenCards([1, 2, 3, 1, 5, 6], true);
// => 2

determineOddEvenCards([1, 2, 3, 1, 5, 6], false);
// => 4