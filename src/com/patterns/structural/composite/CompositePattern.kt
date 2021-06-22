package com.patterns.structural.composite

class CompositePattern

/*
                       Computer
           Cabinet                         Pheripherals
   HardDisk       MotherBoard           Monitor      Mouse
               Ram         CPU
     */


fun main() {
    var hardDisk: Component = Leaf(100, "HDD")
    var mouse: Component = Leaf(50, "Mouse")
    var monitor: Component = Leaf(110, "Monitor")
    var ram: Component = Leaf(80, "Ram")
    var cpu: Component = Leaf(200, "CPU")

    var peripherals = Composite("Peripherals")
    var cabinet = Composite("Cabinet")
    var motherBoard = Composite("MotherBoard")
    var computer = Composite("Computer")

    motherBoard.addComponent(ram)
    motherBoard.addComponent(cpu)

    peripherals.addComponent(mouse)
    peripherals.addComponent(monitor)

    cabinet.addComponent(hardDisk)
    cabinet.addComponent(motherBoard)

    computer.addComponent(peripherals)
    computer.addComponent(cabinet)

    // peripherals.showPrice()
    computer.showPrice()

}