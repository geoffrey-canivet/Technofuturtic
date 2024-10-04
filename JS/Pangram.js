const isPangram = (txt) => {
    let alpha = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];

    // supprime caract spécial
    const tabTxt = txt.toLowerCase().split('').filter(el => el !== ' ' && el !== '.' && el !== '_' && el !== '1' && el !== '2' && el !== '"');
    
    // evite doublon
    let uniqueArr = [...new Set(tabTxt)].sort();
    
    console.log(alpha.join());
    console.log(uniqueArr.join()); 

    // Comparer
    return alpha.join() === uniqueArr.join();
};

console.log(isPangram('"Five quacking Zephyrs jolt my wax bed."')); 

