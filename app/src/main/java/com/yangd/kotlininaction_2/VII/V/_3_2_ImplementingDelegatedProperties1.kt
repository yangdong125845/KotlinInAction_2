package com.yangd.kotlininaction_2.VII.V

import java.beans.PropertyChangeSupport

class ObservableProperty(
    val propName: String, var propValue: Int,
    val changeSupport: PropertyChangeSupport
) {
    fun getValue() :Int = propValue
    fun setValue(newValue:Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(propName,oldValue, newValue)
    }
}

class Person3(
    val name:String,age:Int,salary:Int
):PropertyChangeAware() {
    val _age = ObservableProperty("age",age,changeSupport)
    var age:Int
    get() = _age.getValue()
    set(value) {_age.setValue(value)}

    val _salary = ObservableProperty("salary",salary,changeSupport)
    var salary:Int
    get() = _salary.getValue()
    set(value) {_salary.setValue(value)}
}