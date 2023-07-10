package com.example.demo.repository;

import com.example.demo.graph.CustomNode;

import java.util.List;

public interface EdgeListDao {
    String getOrigin();

    String getOrigCity();

    String getDestination();

    String getDestCity();

    Object[] getAirline();

    Object[] getArrTimes();

    Object[] getDepTimes();

    default CustomNode getOriginNode() {
        return new CustomNode(this.getOrigin(), this.getOrigCity());
    }

    default CustomNode getDestNode() {
        return new CustomNode(this.getDestination(), this.getDestCity());
    }
}
