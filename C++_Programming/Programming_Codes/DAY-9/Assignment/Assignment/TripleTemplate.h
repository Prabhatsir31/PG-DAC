#ifndef TRIPLETEMPLATE_H
#define TRIPLETEMPLATE_H

template<typename T1, typename T2, typename T3>
class TripleTemplate {
private:
    T1 value1;
    T2 value2;
    T3 value3;

public:
    // Setter methods
    void setValue1(const T1& val) { value1 = val; }
    void setValue2(const T2& val) { value2 = val; }
    void setValue3(const T3& val) { value3 = val; }

    // Getter methods
    T1 getValue1() const { return value1; }
    T2 getValue2() const { return value2; }
    T3 getValue3() const { return value3; }
};

#endif
#pragma once
