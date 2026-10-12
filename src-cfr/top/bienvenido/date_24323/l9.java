/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Singleton
 */
package top.bienvenido.date_24323;

import android.util.Singleton;
import top.bienvenido.date_24323.ca;
import top.bienvenido.date_24323.r2;
import top.bienvenido.date_24323.s2;
import top.bienvenido.date_24323.u2;

public abstract class l9 {
    public static final u2 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var0 = Singleton.class.getDeclaredField("mInstance");
                var0.setAccessible(true);
                if ((var0.getModifiers() & 8) != 0) break block8;
                if (!var0.getType().isPrimitive()) ** GOTO lbl13
            }
            var1_2 = v0;
            v0 = new r2(var0);
            break block9;
lbl13:
            // 1 sources

            var0_1 = ca.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.objectFieldOffset(var0);
            var2_3 = v1;
            try {
                v1 = new s2(var0_1);
                var1_2 = var2_3;
            }
            catch (Exception v2) {
                var1_2 = u2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
            }
        }
        l9.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = var1_2;
    }
}

