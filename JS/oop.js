class Size {
    constructor(width = 80, height = 60) {
        this.width = width,
        this.height = height
    }
    resize(width, height){
        this.width = width,
        this.height = height
    }
}

class Position {
    constructor (x  = 0, y = 0){
        this.x = x,
        this.y = y
    }
    move(x, y){
        this.x = x,
        this.y = y
    }
}

class ProgramWindow {
    constructor (){
        this.screenSize = new Size(800, 600)
    }
}
const programWindow = new ProgramWindow();
console.log(programWindow.screenSize.width)