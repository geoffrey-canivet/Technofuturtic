function pizzaPrice(pizza, ...extras) {
    let prix = 0;
    let ExtraSauce = 1;
    let ExtraToppings = 2;
    switch (pizza) {
        case "Margherita":
            prix = 7
            extras.forEach(element => {
                if (element == "ExtraSauce") {
                    prix += 1
                } else {
                    prix += 2
                }
            });
        break;
        case "Caprese":
            prix = 9
            extras.forEach(element => {
                if (element == "ExtraSauce") {
                    prix += 1
                } else {
                    prix += 2
                }
            });
        break;
        case "Formaggio":
            prix = 10
            extras.forEach(element => {
                if (element == "ExtraSauce") {
                    prix += 1
                } else {
                    prix += 2
                }
            });
        break;
    
        default:
            break;
    }
    return
}

pizzaPrice('Caprese', 'ExtraSauce', 'ExtraToppings');
// => 12


function orderPrice(pizzaOrders) {
    
}


const margherita = new PizzaOrder('Margherita');
const caprese = new PizzaOrder('Caprese', 'ExtraToppings');
orderPrice([margherita, caprese]);
// => 18