function buildSign(occasion, name) {
    return `Happy ${occasion} ${name}!`
  }


  function buildBirthdaySign(age) {
    return(`Happy Birthday! What a ${age >= 50 ? 'mature' : 'young'} fellow you are.`) 
  }


  buildBirthdaySign(50);
// => "Happy Birthday! What a mature fellow you are."

buildBirthdaySign(45);
// => "Happy Birthday! What a young fellow you are."




function graduationFor(name, year) {
    return `Congratulations ${name}!\nClass of ${year}`
  }


graduationFor('Hannah', 2022);
// => "Congratulations Hannah!\nClass of 2022


function costOf(sign, currency) {
    return `Your sign costs ${(sign.length * 2 + 20).toFixed(2)} ${currency}.`
}



  costOf('Happy Birthday Rob!', 'dollars');
// => "Your sign costs 58.00 dollars."