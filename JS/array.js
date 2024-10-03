// function seeingDouble(deck) {
//     const newArr = deck.map((value) => value * 2)
//     return newArr
// }



//   let arr = [1, 2, 3, 4];

// const newArr = arr.map((value) => value - 1);



// const arr1 = [1,2,3,4,5,6]

// console.log(arr1.splice(2,0,1))


function middleTwo(deck) {
    return deck.splice((deck.length / 2) - 1, 2);
}
