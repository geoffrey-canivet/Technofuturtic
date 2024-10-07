const transform = (obj) => {
    let newObj = {}
    for (const key in obj) {
  
        for (const element of obj[key]) {
            newObj[element.toLowerCase()] = Number(key)
            
        }
    }
    return newObj
};



const obj = { 1: ['A', 'E', 'I', 'O', 'U'] };
transform(obj)