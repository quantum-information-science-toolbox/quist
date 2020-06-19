package org.quist.units.qubits.operators;

import org.quist.units.qubits.Qubit;
import org.quist.units.qubits.math.complex.ComplexNumber;

public abstract class QuantumOperator {

    private Integer numQubits;

    private Qubit[] qubits;

    private ComplexNumber[][] quantumOperatorMatrix;

    private boolean quantumOperatorApplied;

    public QuantumOperator(Integer numQubits, Qubit[] qubits, ComplexNumber[][] quantumOperatorMatrix) {

        this.numQubits = numQubits;
        this.qubits = qubits;
        this.quantumOperatorMatrix = quantumOperatorMatrix;
        this.quantumOperatorApplied = false;

    }

    public Integer getNumQubits() {
        return this.numQubits;
    }

    public Qubit[] getQubits() {
        return this.qubits;
    }

    public void setQubits(Qubit[] qubits) {
        this.qubits = qubits;
    }

    public ComplexNumber[][] getQuantumOperatorMatrix() {
        return this.quantumOperatorMatrix;
    }

    public void setQuantumOperatorMatrix(ComplexNumber[][] quantumOperatorMatrix) {
        this.quantumOperatorMatrix = quantumOperatorMatrix;
    }

    public abstract String getName();

    public abstract String getInfo();

    public boolean isQuantumOperatorApplied() {
        return this.quantumOperatorApplied;
    }

    public void setQuantumOperatorApplied(boolean quantumOperatorApplied) {
        this.quantumOperatorApplied = quantumOperatorApplied;
    }

}
