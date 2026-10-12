# Native pseudo-decompilation (radare2 6.1.8)
# target: artifacts/aar-extracted/jni/arm64-v8a/libxdfw8yegr.so

===== function @ 0x553b0 =====
// callconv: x0 arm64 (x0, x1, x2, x3, x4, x5, x6, x7, stack);
jint JNI_OnLoad (JavaVM *vm, void *reserved) {
        [sp - 0x10]! = (x29, 2)
        x29 = sp
        x9 = 0xfb95
        x8 = 0xc5000
        x1 = x0       // vm
        x9 |= 0x42af << 16
        x8 = [x8 + 0xc98]
        x0 = 0xdcce0
        x9 |= 0xb69e << 32
        x9 |= 0x557f << 48 // '\x7fU'
        x8 = [x8 + x9]
        x9 = 0x3890
        x9 |= 0xce6 << 16
        x9 |= 0x68ce << 32
        x9 |= 0xe985 << 48
        x8 += x9
        callreg x8    // 0xe98568ce0ce6388f(0xdcce0, 0x0, 0x0, 0x0)
        w0 = 6
        w0 |= 1 << 16
        (x29, 2) = 3  // sp // sp
}


===== function @ 0x55410 =====
// callconv: x0 arm64 (x0, x1, x2, x3, x4, x5, x6, x7, stack);
void sym.Mundo_Activate_SDK (int64_t arg1, int64_t arg_80h) {
        [sp - 0x30]! = (x29, 2)
        [var_10h] = x21
        [var_20h] = (x20, 2)
        x29 = sp
        x9 = 0xd2f6
        x20 = 0xc5000
        x21 = 0x28f
        x9 |= 0xac68 << 16
        x8 = [x20 + 0xca8]
        x21 |= 0x9deb << 16
        x9 |= 0x10ed << 32
        x21 |= 0xcacd << 32
        x19 = x0      // arg1
        x9 |= 0x95c8 << 48
        x21 |= 0x5a73 << 48 // 'sZ'
        x8 = [x8 + x9]
        x8 += x21
        callreg x8    // 0x5a73cacd9deb028e(0x0, 0x0, 0x0, 0x0)
        x9 = 0xd2ee
        x8 = [x20 + 0xca8]
        x1 = x0
        x9 |= 0xac68 << 16
        x9 |= 0x10ed << 32
        x9 |= 0x95c8 << 48
        x8 = [x8 + x9]
        x16 = x8 + x21
        x0 = x19
        (x20, 2) = 3
        x21 = [var_10h]
        (x29, 2) = 3  // sp // sp
        switch x16
        sp -= 0x80
        [var_20h_2] = (x29, 2)
        [var_30h] = (x28, 2)
        [var_40h] = (x26, 2)
        [var_50h] = (x24, 2)
        [var_10h] = (x22, 2)
        [var_20h] = (x20, 2)
        x15 = 0x94fc
        x10 = 0xc9000
        x9 = 0x96f6
        x15 |= 0xdf2d << 16
        x10 = [x10 + 0x8b0]
        x11 = 0xbd9b
        x15 |= 0x77bf << 32
        x12 = 0xfe92
        x8 = 0x4aa9
        x15 |= 0xcdf8 << 48
        x9 |= 0xcf70 << 16
        x11 |= 0xc93b << 16
        x12 |= 0x8c87 << 16
        x16 = 0x4091  // (pstr 0x00000c4f) "cific"
        x22 = 0xa898
        x7 = 0xe4de
        w10 = [x10 + x15]
        x5 = 0xc5e8
        x8 |= 0xd2ce << 16
        x9 |= 0x4495 << 32
        x11 |= 0x4495 << 32
        x12 |= 0x4495 << 32
        x16 |= 0x6080 << 16
        x22 |= 0x13cb << 16
        x7 |= 0x1157 << 16 // 'W\x11'
        x5 |= 0x27a4 << 16
        x8 |= 0x4495 << 32
        x9 |= 0x4b57 << 48 // 'WK'
        x11 |= 0x4b57 << 48 // 'WK'
        x12 |= 0x4b57 << 48 // 'WK'
        x16 |= 0x4495 << 32
        x22 |= 0x4495 << 32
        x7 |= 0x4495 << 32
        (a, b) = compare (w10, 1)
        x5 |= 0x270a << 32 // '\n\''
        x8 |= 0x4b57 << 48 // 'WK'
        x16 |= 0x4b57 << 48 // 'WK'
        x22 |= 0x4b57 << 48 // 'WK'
        x7 |= 0x4b57 << 48 // 'WK'
        w17 = 0x48    // 'H'
        x13 = x1 + 0x1c
        w3 = 0xc0
        x4 = 0xc9000
        x5 |= 0xcea8 << 48
        w6 = 0x58     // 'X'
        x10 = (eq)? x9 : x12
        w19 = 0x40    // elf_phdr
        w27 = 0x10
        w28 = 0x68    // 'h'
        w30 = 8
        w26 = 0xa8
        w2 = 0xb8
        x14 = x11
        [sp] = x0
        [var_10h_2] = (x13, 2)
        [var_8h] = x10
        goto 0x555b0
        
    loc_0x000555b0:
        // CODE XREF from sym.Mundo_Activate_SDK @ 0x55590(x)
        x23 = [x4 + 0x8b8]
        (a, b) = compare (x14, x12)
        x13 = (lo)? x3 : x17
        x23 += x15
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        (a, b) = compare (x14, x22)
        x13 = (lo)? x19 : x6
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        (a, b) = compare (x14, x7)
        w13 = 0x50    // 'P'
        w29 = 0x88
        x13 = (eq)? x29 : x13
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        x13 = [x4 + 0x8b8]
        (a, b) = compare (x22, x12)
        x14 = (lo)? x3 : x17
        x23 = x13 + x15
        x13 = [x23 + x14]
        w14 = w21 + w25
        eon w1, w10, w14
        x14 = x22
        x13 += x5
        switch x13
        (a, b) = compare (x14, x16)
        w13 = 0x18
        w29 = 0x80
        x13 = (lo)? x29 : x13
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        (a, b) = compare (x14, x22)
        w13 = 0xc8
        x13 = (eq)? 0 : x13
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        x13 = [sp]
        w24 = w20 + 1
        w0 = w10 ^ w1
        (a, b) = compare (w24, 4)
        x29 = x7
        x7 = x11
        strb w0, [x13, w20, sxtw]
        x14 = (eq)? x8 : x12
        x11 = x16
        x13 = [x4 + 0x8b8]
        (a, b) = compare (x14, x12)
        x16 = (lo)? x3 : x17
        x23 = x13 + x15
        x13 = [x23 + x16]
        x16 = x11
        x11 = x7
        x7 = x29
        x13 += x5
        switch x13
        w13 = 0x20
        w29 = 0x38    // '8' // "\t@\x1c\x1b\x06"
        x13 = (eq)? x29 : x13 // "\t@\x1c\x1b\x06"
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        x13 = [x4 + 0x8b8]
        (a, b) = compare (x22, x12)
        x14 = (lo)? x3 : x17
        x23 = x13 + x15
        x13 = [x23 + x14]
        w14 = w25 - w21
        w14 ^= w10
        x13 += x5
        w1 = -w14
        x14 = x22
        switch x13
        (a, b) = compare (x14, x9)
        x13 = (lo)? x28 : x27
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        (a, b) = compare (x14, x11)
        w13 = 0x98
        x13 = (lo)? x30 : x13
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        (a, b) = compare (x14, x12)
        w13 = 0x28    // '('
        w29 = 0x30    // '0'
        x13 = (eq)? x29 : x13
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        w10 = w24 >> 2
        w13 = 0x4925  // '%I'
        w21 = w0
        w13 |= 0x2492 << 16
        umull x10, w10, w13
        w13 = 0x1c
        x10 = x10 >> 0x20
        w13 = (w10 * w13) - w24
        x10 = [var_10h_2]
        ldrb w25, [x10, w24, sxtw]
        x10 = [var_18h]
        ldrb w10, [x10, w13, uxtw]
        w13 *= w10
        (a, b) = compare (w13, 1)
        x13 = [x4 + 0x8b8]
        x14 = (eq)? x7 : x16
        (a, b) = compare (x14, x12)
        x23 = x13 + x15
        x20 = (lo)? x3 : x17
        x13 = [x23 + x20]
        w20 = w24
        x13 += x5
        switch x13
        (a, b) = compare (x14, x8)
        x13 = (lo)? x2 : x26
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        w13 = 0x70    // 'p'
        w29 = 0x78    // 'x'
        x13 = (eq)? x29 : x13
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        x13 = 0xc9000
        w14 = 1
        (a, b) = compare (x9, x12)
        x13 = [x13 + 0x8b0]
        [x13 + x15] = w14
        x14 = (lo)? x3 : x17
        x13 = [x4 + 0x8b8]
        x23 = x13 + x15
        x13 = [x23 + x14]
        x14 = x9
        x13 += x5
        switch x13
        w13 = 0xa0
        w29 = 0x60    // '`'
        x13 = (eq)? x29 : x13
        x13 = [x23 + x13]
        x13 += x5
        switch x13
        x29 = [var_8h]
        x13 = [x4 + 0x8b8]
        w24 = 0
        w0 = 0
        (a, b) = compare (x29, x12)
        x23 = x13 + x15
        x14 = (lo)? x3 : x17
        x13 = [x23 + x14]
        x14 = x29
        x13 += x5
        switch x13
        (x20, 2) = 3
        (x22, 2) = 3
        (x24, 2) = 3
        (x26, 2) = 3
        (x28, 2) = 3
        (x29, 2) = 3
        sp += 0x80
}


