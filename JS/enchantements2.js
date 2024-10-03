function getCardPosition(stack, card) {
    return stack.indexOf(card)
  }


const card = 2;
getCardPosition([9, 7, 3, 2], card);
// => 3

function doesStackIncludeCard(stack, card) {
    const index = stack.findIndex(num => num === card);
    return index !== -1;
}

// const card = 9;

console.log(doesStackIncludeCard([2, 3, 4, 5], card))

function isEachCardEven(stack) {
    return stack.every((num) => num % 2 !== 0)
}


function doesStackIncludeOddCard(stack) {
    return stack.some((num) => num % 2 !== 0)
}

export function getFirstOddCard(stack) {
    return stack.find((num) => num % 2 !== 0)
}

function getFirstEvenCardPosition(stack) {
    return stack.findIndex((num) => num % 2 === 0)
}