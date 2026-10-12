/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package top.bienvenido.date_24323;

import android.content.ContentProvider;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import top.bienvenido.date_24323.b3;
import top.bienvenido.date_24323.f4;
import top.bienvenido.date_24323.h6;
import top.bienvenido.date_24323.p2;
import top.bienvenido.date_24323.\u4f60\u91ce\u7239\u6211\u51b2\u8fdb\u5993\u9662\u770b\u89c1\u4f60\u5988\u6b63\u5728\u8ddf\u4eba\u73a9SM\u4f60\u90a3\u5e9f\u7269\u7238\u8e72\u5728\u89d2\u843d\u81ea\u6170\u5c04\u65c1\u8fb9\u72d7\u5c4e\u4e0a\u4f60\u5988\u88ab\u72d7\u5c4e\u585e\u903c\u624d\u751f\u4e0b\u4e86\u4f60\u8fd9\u4e2a\u4eba\u72d7\u6742\u4ea4\u7684\u5d3d\u79cd;

public abstract class r8 {
    public static final String \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = b3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403 + ".provider.stub";
    public static final p2 \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403 = new p2("mLocalProvider");

    public static Pair \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Uri uri) {
        Object object;
        block14: {
            Object object2;
            block13: {
                block12: {
                    Uri uri2;
                    try {
                        uri2 = uri;
                        object = "content://" + (\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 + f4.\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988) + "/";
                    }
                    catch (Exception exception) {
                        return null;
                    }
                    if (StringsKt.startsWith$default((String)uri2.toString(), (String)object, (boolean)false, (int)2, null)) break block12;
                    return null;
                }
                uri = Uri.parse((String)("content://" + uri.toString().substring(((String)object).length())));
                object = \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
                object2 = h6.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
                String string = uri.getAuthority();
                Map map = h6.\u8981\u662f\u6709\u766b\u75eb\u53ef\u4ee5\u4e0d\u7528\u8bb2\u8bdd\u4e5f\u6700\u597d\u5c11\u73a9\u6e38\u620f\u75c5\u90a3\u4e48\u91cd\u4e86\u8fd8\u71ac\u591c\u6253\u6392\u4f4d\u662f\u51c6\u5907\u65e9\u70b9\u53bb\u89c1\u960e\u738b\u7237\u548c\u60a8\u4eb2\u5988\u91ce\u5988\u6b22\u805a\u4e00\u5802\u60a8\u8fd9\u64cd\u4f5c\u6280\u672f\u6211\u4e5f\u5b9e\u5728\u611f\u4f69\u6211\u7740\u5b9e\u62c5\u5fc3\u4f60\u7238\u5916\u9047\u4e0d\u591f\u591a\u51e0\u573a\u6392\u4f4d\u4e0b\u6765\u60a8\u4e0d\u8ba1\u5176\u6570\u7684\u91ce\u5988\u4e5f\u6b7b\u5f97\u591f\u545b;
                object2.getClass();
                Constructor constructor = h6.\u6211\u4e00\u62f3\u628a\u4f60\u4e2a\u9020\u8c23\u667a\u969c\u7838\u8fdb\u4f60\u5a4a\u5b50\u5988\u5c41\u773c\u5b50\u91cc\u5e7b\u5316\u6210\u5c4e\u4f60\u5988\u8fd9\u5403\u5c4e\u7684\u5e9f\u7269\u8fd8\u4ee5\u4e3a\u4f60\u7239\u6211\u5b66\u4f1a\u4e86\u590d\u5236\u795e\u529f\u590d\u5236\u51fa\u4e00\u5768\u5c4e\u7ed9\u5979\u5403\u5462;
                object2 = b3.\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403;
                object2 = map.get(constructor.newInstance(string, object2));
                if (object2 != null) break block13;
                return null;
            }
            object = (ContentProvider)((p2)object).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(object2);
            if (object != null) break block14;
            return null;
        }
        return TuplesKt.to((Object)uri, (Object)object);
    }

    /*
     * Exception decompiling
     */
    public static Intent \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Intent var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 35->41)] java.lang.Exception
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string) {
        block7: {
            Map map;
            try {
                map = h6.\u8981\u662f\u6709\u766b\u75eb\u53ef\u4ee5\u4e0d\u7528\u8bb2\u8bdd\u4e5f\u6700\u597d\u5c11\u73a9\u6e38\u620f\u75c5\u90a3\u4e48\u91cd\u4e86\u8fd8\u71ac\u591c\u6253\u6392\u4f4d\u662f\u51c6\u5907\u65e9\u70b9\u53bb\u89c1\u960e\u738b\u7237\u548c\u60a8\u4eb2\u5988\u91ce\u5988\u6b22\u805a\u4e00\u5802\u60a8\u8fd9\u64cd\u4f5c\u6280\u672f\u6211\u4e5f\u5b9e\u5728\u611f\u4f69\u6211\u7740\u5b9e\u62c5\u5fc3\u4f60\u7238\u5916\u9047\u4e0d\u591f\u591a\u51e0\u573a\u6392\u4f4d\u4e0b\u6765\u60a8\u4e0d\u8ba1\u5176\u6570\u7684\u91ce\u5988\u4e5f\u6b7b\u5f97\u591f\u545b;
                h6.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.getClass();
            }
            catch (Exception exception) {
                return null;
            }
            Integer n10 = b3.\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403;
            n10 = map.get(h6.\u6211\u4e00\u62f3\u628a\u4f60\u4e2a\u9020\u8c23\u667a\u969c\u7838\u8fdb\u4f60\u5a4a\u5b50\u5988\u5c41\u773c\u5b50\u91cc\u5e7b\u5316\u6210\u5c4e\u4f60\u5988\u8fd9\u5403\u5c4e\u7684\u5e9f\u7269\u8fd8\u4ee5\u4e3a\u4f60\u7239\u6211\u5b66\u4f1a\u4e86\u590d\u5236\u795e\u529f\u590d\u5236\u51fa\u4e00\u5768\u5c4e\u7ed9\u5979\u5403\u5462.newInstance(string, n10));
            if (n10 == null) break block7;
            if (r8.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(n10) == null) break block7;
            return \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 + f4.\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988;
        }
        string = \u4f60\u91ce\u7239\u6211\u51b2\u8fdb\u5993\u9662\u770b\u89c1\u4f60\u5988\u6b63\u5728\u8ddf\u4eba\u73a9SM\u4f60\u90a3\u5e9f\u7269\u7238\u8e72\u5728\u89d2\u843d\u81ea\u6170\u5c04\u65c1\u8fb9\u72d7\u5c4e\u4e0a\u4f60\u5988\u88ab\u72d7\u5c4e\u585e\u903c\u624d\u751f\u4e0b\u4e86\u4f60\u8fd9\u4e2a\u4eba\u72d7\u6742\u4ea4\u7684\u5d3d\u79cd.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(string);
        if (string.getFirst() != null) {
            return (String)string.getSecond();
        }
        if (string.getThird() == null) return null;
        return \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 + f4.\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(Uri uri) {
        String string;
        block7: {
            try {
                if (!Intrinsics.areEqual((Object)uri.getScheme(), (Object)"content")) {
                    if (!Intrinsics.areEqual((Object)uri.getScheme(), (Object)"package")) return uri;
                    if (!Intrinsics.areEqual((Object)uri.getSchemeSpecificPart(), (Object)f4.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403)) return uri;
                    return Uri.fromParts((String)"package", (String)b3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403, null);
                }
                string = uri.getAuthority();
                if (string == null) {
                    return uri;
                }
                string = r8.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(string);
                if (string != null) break block7;
                return uri;
            }
            catch (Exception exception) {
                return uri;
            }
        }
        return Uri.parse((String)("content://" + string + "/" + uri.toString().substring(10)));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Intent intent, String string) {
        ArrayList<Uri> arrayList;
        Object object;
        block8: {
            try {
                object = intent.getExtras();
                if (object == null) return;
                object = object.get(string);
                if (!(object instanceof Uri)) break block8;
                intent.putExtra(string, (Parcelable)r8.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((Uri)object));
            }
            catch (Exception exception) {
                return;
            }
            return;
        }
        if (!(object instanceof ArrayList)) return;
        Object object2 = object;
        ArrayList<Uri> arrayList2 = arrayList;
        arrayList = new ArrayList<Uri>(((ArrayList)object).size());
        object = ((ArrayList)object2).iterator();
        while (object.hasNext()) {
            arrayList2.add(r8.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((Uri)object.next()));
        }
        {
            if (arrayList2.isEmpty()) return;
            intent.putExtra(string, arrayList2);
        }
    }
}

