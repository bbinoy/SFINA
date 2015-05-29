/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.input;

/**
 *
 * @author evangelospournaras
 */
public enum PowerNodeState {
    ID,
    TYPE,
    REAL_POWER_DEMAND,
    REACTIVE_POWER_DEMAND,
    SHUNT_CONDUCT,
    SHUNT_SUSCEP,
    AREA,
    VOLTAGE_MAGNITUDE,
    VOLTAGE_ANGLE,
    BASE_VOLTAGE,
    ZONE,
    VOLTAGE_MAX,
    VOLTAGE_MIN,
    REAL_POWER_GENERATION,
    REACTIVE_POWER_GENERATION,
    REACTIVE_POWER_MAX,
    REACTIVE_POWER_MIN,
    VOLTAGE_SETPOINT,
    TOTAL_MVA_BASE,
    STATUS,
    REAL_POWER_MAX,
    REAL_POWER_MIN,
    PC1,        // lower real power output of PQ capability curve (Matpower parameter)
    PC2,
    QC1_MIN,    // minimum reactive power output at PC1 (Matpower parameter)
    QC1_MAX,
    QC2_MIN,
    QC2_MAX,
    RAMP_AGC,   // ramp rate for load following/AGC
    RAMP_10,    // ramp rate 10 minute reserve
    RAMP_30,
    RAMP_REACTIVE_POWER,
    AREA_PART_FACTOR,
    MODEL,      // 1 = cost model, 2 = piecewise linear, 3 = polynomial
    STARTUP,    // startup cost in USD
    SHUTDOWN,
    N_COST,     // number of cost parameters/coefficients for polynomial cost function
    COST_PARAM, // first parameter/coefficient defining total cost function
    COST_PARAM_1, // second param
    COST_PARAM_2,
    COST_PARAM_3,
    //reactive_power_min,volt_setpoint,mBase,status,real_power_max,real_power_min,Pc1,Pc2,Qc1min,Qc1max,Qc2min,Qc2max,ramp_agc,ramp_10,ramp_30,ramp_q,apf
}
