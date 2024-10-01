function cookingStatus (rest) {
    
    if (isNaN(rest)) {
        return ('You forgot to set the timer.')
    } else if (rest === 0) {
       return ("Lasagna is done.")
    } else {
        return ('Not done, please wait.')
    }
}

cookingStatus(12);
// => 'Not done, please wait.'

cookingStatus();
// => 'You forgot to set the timer.'

function preparationTime (tabLayers, time) {
    const nbLayers = tabLayers.length
        
    if (isNaN(time)) {
        return (nbLayers*2)
    } else {
        return (nbLayers*time)
    }
}


const layers = ['sauce', 'noodles', 'sauce', 'meat', 'mozzarella', 'noodles'];
preparationTime(layers, 3);
// => 18

preparationTime(layers);
// => 12


function quantities (tabLayers) {
    let nbSauce = tabLayers.filter(num => num === 'sauce').length
    let nbNoodles = tabLayers.filter(num => num === 'noodles').length
    return {
        noodles: nbNoodles * 50,
        sauce: nbSauce * 0.2
    }
    
}

console.log(quantities(['sauce', 'noodles', 'sauce', 'meat', 'mozzarella', 'noodles']))
// => { noodles: 100, sauce: 0.4 }


function addSecretIngredient (friendTab, myTab) {
    let secretIngredient = friendTab[friendTab.length - 1]
    myTab.push(secretIngredient)
    return myTab
    
}

const friendsList = ['noodles', 'sauce', 'mozzarella', 'kampot pepper'];
const myList = ['noodles', 'meat', 'sauce', 'mozzarella'];

addSecretIngredient(friendsList, myList);
// => undefined

console.log(myList);
// => ['noodles', 'meat', 'sauce', 'mozzarella', 'kampot pepper']




function scaleRecipe(rec, nb) {
    let newRecipe = { ...rec }; // Clone la recette originale
    const factor = nb / 2; // Facteur pour ajuster les portions
    
    for (let key in newRecipe) {
        newRecipe[key] = rec[key] * factor; // Ajuste la quantité
    }

    return newRecipe;
}


const recipe = {
    noodles: 200,
    sauce: 0.5,
    mozzarella: 1,
    meat: 100,
  };
  
  scaleRecipe(recipe, 2);
  // =>
  // {
  //   noodles: 400,
  //   sauce: 1,
  //   mozzarella: 2,
  //   meat: 200,
  // };
  
  console.log(recipe);
  // =>
  // {
  //   noodles: 200,
  //   sauce: 0.5,
  //   mozzarella: 1,
  //   meat: 100,
  // };