package com.codebyn.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelColumnNameMapperTest {

    @Test
    void returnsEmptyStringIfNumberIsZero() {
        assertEquals("", ExcelColumnNameMapper.calculateMapping(0));
    }

    @Test
    void returnsZFor26() {
        assertEquals("Z", ExcelColumnNameMapper.calculateMapping(26));
    }

    @Test
    void edgeCase52ReturnsAZ() {
        assertEquals("AZ", ExcelColumnNameMapper.calculateMapping(52));
    }

    @Test
    void scalesFor702AndReturnsZZ() {
        assertEquals("ZZ", ExcelColumnNameMapper.calculateMapping(702));
    }

    @Test
    void scalesFor703AndReturnsAAA() {
        assertEquals("AAA", ExcelColumnNameMapper.calculateMapping(703));
    }
}