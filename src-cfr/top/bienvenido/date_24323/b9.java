/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Service
 *  android.os.ServiceManager
 *  android.os.ServiceWithMetadata
 *  kotlin.TuplesKt
 */
package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Service;
import android.os.ServiceManager;
import android.os.ServiceWithMetadata;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.TuplesKt;
import top.bienvenido.date_24323.ca;
import top.bienvenido.date_24323.d1;
import top.bienvenido.date_24323.d2;
import top.bienvenido.date_24323.n4;
import top.bienvenido.date_24323.n9;
import top.bienvenido.date_24323.q2;
import top.bienvenido.date_24323.r2;
import top.bienvenido.date_24323.s2;
import top.bienvenido.date_24323.u2;
import top.bienvenido.date_24323.z8;
import top.bienvenido.date_24323.\u4f60\u8116\u5b50\u4e0a\u9876\u7684\u662f\u80bf\u7624\u4f60\u4e00\u65e5\u4e09\u9910\u662f\u72ac\u7c7b\u6392\u6cc4\u7269\u4f60\u7684\u957f\u76f8\u5c31\u662f\u6492\u65e6\u7684\u540a\u5b81\u8bf4\u7684\u6bcf\u4e00\u53e5\u8bdd\u90fd\u662f\u6bcd\u72d7\u53d1\u60c5\u5b81\u7684\u5b58\u5728\u7b80\u76f4\u5c31\u662f\u9ea6\u514b\u65af\u97e6\u65b9\u7a0b\u7ec4\u7684\u7455\u75b5\u5b81\u7684\u6bcd\u4eb2\u5c31\u662f\u4e00\u53ea\u9e21\u5b81\u7684\u751f\u6b96\u5668\u582a\u6bd4\u963f\u7c73\u5df4\u539f\u866b\u5b81\u7684\u4e00\u4e3e\u4e00\u52a8\u90fd\u50cf\u4e2a\u738b\u516b;

public final class b9 {
    public static final n9 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    public static final Map \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;

    public static final Service \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(n4 n42) {
        new ServiceWithMetadata().service = n42;
        return Service.serviceWithMetadata((ServiceWithMetadata)new ServiceWithMetadata());
    }

    public static final Service \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(n4 n42) {
        return Service.binder((IBinder)n42);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block12: {
                b9.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new n9(0);
                v0 = ServiceManager.class;
                v1 = "sCache";
                var0 = v0.getDeclaredField(v1);
                var0.setAccessible(true);
                if ((var0.getModifiers() & 8) != 0) break block12;
                if (!var0.getType().isPrimitive()) ** GOTO lbl17
            }
            var1_2 = v2;
            v2 = new r2((Field)var0);
            break block13;
lbl17:
            // 1 sources

            var0_1 = ca.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.objectFieldOffset((Field)var0);
            var2_3 = v3;
            try {
                v3 = new s2(var0_1);
                var1_2 = var2_3;
            }
            catch (Exception v4) {
                var1_2 = u2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
            }
        }
        var0 = (Map)var1_2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(null);
        {
            catch (Exception v5) {
                var0 = v6;
                v6 = new \u4f60\u8116\u5b50\u4e0a\u9876\u7684\u662f\u80bf\u7624\u4f60\u4e00\u65e5\u4e09\u9910\u662f\u72ac\u7c7b\u6392\u6cc4\u7269\u4f60\u7684\u957f\u76f8\u5c31\u662f\u6492\u65e6\u7684\u540a\u5b81\u8bf4\u7684\u6bcf\u4e00\u53e5\u8bdd\u90fd\u662f\u6bcd\u72d7\u53d1\u60c5\u5b81\u7684\u5b58\u5728\u7b80\u76f4\u5c31\u662f\u9ea6\u514b\u65af\u97e6\u65b9\u7a0b\u7ec4\u7684\u7455\u75b5\u5b81\u7684\u6bcd\u4eb2\u5c31\u662f\u4e00\u53ea\u9e21\u5b81\u7684\u751f\u6b96\u5668\u582a\u6bd4\u963f\u7c73\u5df4\u539f\u866b\u5b81\u7684\u4e00\u4e3e\u4e00\u52a8\u90fd\u50cf\u4e2a\u738b\u516b(0);
            }
        }
        b9.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403 = var0;
    }

    /*
     * Exception decompiling
     */
    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [23 : 156->168)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d1 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String var0, d2 var1_1, String var2_2) {
        v0 = var0;
        var3_3 = b9.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        ** synchronized (b9.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403)
lbl-1000:
        // 1 sources

        {
            block21: {
                var4_4 = ServiceManager.getService((String)v0);
                if (var4_4 != null) break block21;
                // ** MonitorExit[var3_3] (shouldn't be in output)
                return null;
            }
            // ** MonitorExit[var3_3] (shouldn't be in output)
            if (var2_2 != null) ** GOTO lbl21
            var2_2 = var4_4.getInterfaceDescriptor();
            if (var2_2 == null) return null;
            var2_2 = (String)var2_2 + "$Stub";
            if (var2_2 == null) {
                return null;
            }
lbl21:
            // 3 sources

            v1 = var2_2;
            var2_2 = "asInterface";
            v2 = new Class[1];
            var3_3 = v2;
            v2[0] = IBinder.class;
            v3 = Class.forName((String)v1);
            try {
                var2_2 = v3.getDeclaredMethod((String)var2_2, (Class<?>[])var3_3);
                var2_2.setAccessible(true);
            }
            catch (Exception v4) {
                try {
                    v5 = u2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
                    ** GOTO lbl39
                }
                catch (Exception v6) {
                    block22: {
                        try {
                            v5 = u2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
lbl39:
                            // 2 sources

                            var3_3 = v5;
lbl40:
                            // 2 sources

                            v7 = var3_3;
                            var2_2 = null;
                            v8 = new Object[1];
                        }
                        catch (Exception v9) {
                            return null;
                        }
                        var3_3 = v8;
                        v8[0] = var4_4;
                        var2_2 = v7.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(var2_2, var3_3);
                        if (var2_2 != null) break block22;
                        return null;
                    }
                    return b9.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(var0, var1_1, var4_4, var2_2);
                }
            }
            var3_3 = v10;
            v10 = new q2((Method)var2_2);
            ** GOTO lbl40
            catch (Throwable v11) {
                // ** MonitorExit[var3_3] (shouldn't be in output)
                throw v11;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d1 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String object, d2 d22, IBinder object2, Object object3) {
        z8 z82;
        n4 n42;
        d1 d12;
        String cfr_ignored_0 = "Working on " + (String)object + " with invocation handler...";
        d1 d13 = d12;
        d12 = new d1(object3, d22);
        object3 = n42;
        n42 = new n4((IBinder)object2, (IInterface)d13.\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403);
        object2 = \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
        synchronized (object2) {
            int n10 = ((String)object).hashCode();
            ((n9)object2).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(n10, TuplesKt.to((Object)object3, (Object)d13));
        }
        object2 = \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        synchronized (object2) {
            object2.put(object, object3);
        }
        object = z82;
        z82 = new z8((n4)object3, d22);
        d12.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(-1772511108, object);
        return d12;
    }
}

