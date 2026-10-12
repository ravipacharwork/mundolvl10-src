/*
 * Decompiled with CFR 0.152.
 */
package top.bienvenido.date_24323;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

public final class s8
extends ProxySelector {
    public final List \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = Collections.singletonList(Proxy.NO_PROXY);
    public final List \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;

    public s8(Proxy proxy) {
        this.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403 = Collections.singletonList(proxy);
    }

    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string, String string2) {
        if (string != null) {
            System.setProperty("http.proxyHost", string);
            System.setProperty("https.proxyHost", string);
            System.setProperty("http.nonProxyHosts", "localhost|127.*|[::1]|0.0.0.0|[::0]");
            System.setProperty("https.nonProxyHosts", "localhost|127.*|[::1]|0.0.0.0|[::0]");
            System.setProperty("http.proxyPort", string2);
            System.setProperty("https.proxyPort", string2);
            return;
        }
        System.clearProperty("http.proxyHost");
        System.clearProperty("https.proxyHost");
        System.clearProperty("http.nonProxyHosts");
        System.clearProperty("https.nonProxyHosts");
        System.clearProperty("http.proxyPort");
        System.clearProperty("https.proxyPort");
    }

    @Override
    public final void connectFailed(URI uRI, SocketAddress socketAddress, IOException iOException) {
    }

    public final List select(URI object) {
        block20: {
            Object object2;
            block25: {
                block24: {
                    block21: {
                        block22: {
                            block23: {
                                if (object == null) {
                                    return ((s8)object3).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
                                }
                                object2 = ((URI)object).getHost();
                                if (object2 == null) {
                                    return ((s8)object3).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
                                }
                                if (object2.equalsIgnoreCase("localhost")) break block20;
                                char c10 = object2.charAt(0);
                                if (c10 == '0') break block21;
                                if (c10 == '1') break block22;
                                if (c10 == ':') break block23;
                                if (c10 != '[') break block24;
                                if (!object2.equals("[::1]") && !object2.equals("[::0]")) break block25;
                                break block20;
                            }
                            if (!object2.equals("::1") && !object2.equals("::0")) break block25;
                            break block20;
                        }
                        if (!object2.startsWith("127.") && !object2.startsWith("10.") && !object2.startsWith("192.168.") && !object2.startsWith("169.254.")) break block24;
                        break block20;
                    }
                    if (object2.equals("0.0.0.0")) break block20;
                }
                if (object2.endsWith(".local") || object2.endsWith(".internal") || object2.endsWith(".lan") || object2.indexOf(46) == -1 && object2.indexOf(58) == -1) break block20;
            }
            if ((object = ((URI)object).getScheme()) == null) {
                return ((s8)object3).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
            }
            if (!"https".equalsIgnoreCase((String)object) && !"http".equalsIgnoreCase((String)object)) {
                if ("ftp".equalsIgnoreCase((String)object)) {
                    boolean bl;
                    object = System.getProperty("ftp.nonProxyHosts");
                    if (object == null) {
                        bl = false;
                    } else {
                        StringBuilder stringBuilder;
                        StringBuilder stringBuilder2 = stringBuilder;
                        stringBuilder = new StringBuilder();
                        for (int i10 = 0; i10 < ((String)object).length(); ++i10) {
                            char c11 = ((String)object).charAt(i10);
                            if (c11 != '*') {
                                if (c11 != '.') {
                                    stringBuilder2.append(c11);
                                    continue;
                                }
                                stringBuilder2.append("\\.");
                                continue;
                            }
                            stringBuilder2.append(".*");
                        }
                        bl = object2.matches(stringBuilder2.toString());
                    }
                    if (bl) {
                        return ((s8)object3).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
                    }
                    Object object3 = "ftp.proxyPort";
                    int n10 = 80;
                    object2 = System.getProperty("ftp.proxyHost");
                    if (object2 != null && !object2.isEmpty()) {
                        Proxy proxy;
                        if ((object3 = System.getProperty((String)object3)) != null) {
                            try {
                                n10 = Integer.parseInt((String)object3);
                            }
                            catch (NumberFormatException numberFormatException) {}
                        }
                        object3 = proxy;
                        String string = object2;
                        object2 = Proxy.Type.HTTP;
                        proxy = new Proxy((Proxy.Type)((Object)object2), InetSocketAddress.createUnresolved(string, n10));
                    } else {
                        object3 = null;
                    }
                    return Collections.singletonList(object3);
                }
                if ("socket".equalsIgnoreCase((String)object)) {
                    if (!((Object)((Object)((Proxy)((s8)object3).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.get(0)).type())).equals((Object)Proxy.Type.SOCKS)) {
                        return ((s8)object3).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
                    }
                    return ((s8)object3).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
                }
                return ((s8)object3).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
            }
            return ((s8)object3).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        }
        return ((s8)object3).\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    }
}

