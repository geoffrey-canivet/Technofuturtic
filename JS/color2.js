const decodedValue = (tabColor) => {
    let c1c2= []
    for (let i = 0; i < tabColor.length; i++){
        switch (tabColor[i]) {
            case "black":
                c1c2.push(0)
            break;
                
            case "brown":
                c1c2.push(1)
            break;
    
            case "red":
                c1c2.push(2)
            break;
    
            case "orange":
                c1c2.push(3)
            break;
    
            case "yellow":
                c1c2.push(4)
            break;
    
            case "green":
                c1c2.push(5)
            break;
    
            case "blue":
                c1c2.push(6)
            break;
    
            case "violet":
                c1c2.push(7)
            break;
    
            case "grey":
                c1c2.push(8)
            break;
    
            case "white":
                c1c2.push(9)
            break;
        
            default:
                break;
        }
    }
    returnc1c2.join("")
}


