package top.bienvenido.date_24323;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/s8.class */
public final class s8 extends ProxySelector {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final List f323 = Collections.singletonList(Proxy.NO_PROXY);

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final List f324;

    public s8(Proxy proxy) {
        this.f324 = Collections.singletonList(proxy);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m478(String str, String str2) {
        if (str != null) {
            System.setProperty("http.proxyHost", str);
            System.setProperty("https.proxyHost", str);
            System.setProperty("http.nonProxyHosts", "localhost|127.*|[::1]|0.0.0.0|[::0]");
            System.setProperty("https.nonProxyHosts", "localhost|127.*|[::1]|0.0.0.0|[::0]");
            System.setProperty("http.proxyPort", str2);
            System.setProperty("https.proxyPort", str2);
            return;
        }
        System.clearProperty("http.proxyHost");
        System.clearProperty("https.proxyHost");
        System.clearProperty("http.nonProxyHosts");
        System.clearProperty("https.nonProxyHosts");
        System.clearProperty("http.proxyPort");
        System.clearProperty("https.proxyPort");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r0.equals("[::0]") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r0.equals("::0") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d0, code lost:
    
        if (r0.indexOf(58) != (-1)) goto L56;
     */
    @Override // java.net.ProxySelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List select(URI uri) {
        String scheme;
        boolean zMatches;
        Proxy proxy;
        if (uri == null) {
            return this.f323;
        }
        String host = uri.getHost();
        if (host == null) {
            return this.f323;
        }
        if (!host.equalsIgnoreCase("localhost")) {
            char cCharAt = host.charAt(0);
            if (cCharAt != '0') {
                if (cCharAt != '1') {
                    if (cCharAt != ':') {
                        if (cCharAt == '[') {
                            if (!host.equals("[::1]")) {
                            }
                        }
                        if (!host.endsWith(".local")) {
                            if (!host.endsWith(".internal")) {
                                if (!host.endsWith(".lan")) {
                                    if (host.indexOf(46) == -1) {
                                    }
                                    scheme = uri.getScheme();
                                    if (scheme == null) {
                                        return this.f323;
                                    }
                                    if (!"https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) {
                                        return this.f324;
                                    }
                                    if (!"ftp".equalsIgnoreCase(scheme)) {
                                        if ("socket".equalsIgnoreCase(scheme)) {
                                            return !((Proxy) this.f324.get(0)).type().equals(Proxy.Type.SOCKS) ? this.f323 : this.f324;
                                        }
                                        return this.f323;
                                    }
                                    String property = System.getProperty("ftp.nonProxyHosts");
                                    if (property == null) {
                                        zMatches = false;
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        for (int i = 0; i < property.length(); i++) {
                                            char cCharAt2 = property.charAt(i);
                                            if (cCharAt2 == '*') {
                                                sb.append(".*");
                                            } else if (cCharAt2 != '.') {
                                                sb.append(cCharAt2);
                                            } else {
                                                sb.append("\\.");
                                            }
                                        }
                                        zMatches = host.matches(sb.toString());
                                    }
                                    if (zMatches) {
                                        return this.f323;
                                    }
                                    int i2 = 80;
                                    String property2 = System.getProperty("ftp.proxyHost");
                                    if (property2 == null || property2.isEmpty()) {
                                        proxy = null;
                                    } else {
                                        String property3 = System.getProperty("ftp.proxyPort");
                                        if (property3 != null) {
                                            try {
                                                i2 = Integer.parseInt(property3);
                                            } catch (NumberFormatException unused) {
                                            }
                                        }
                                        proxy = proxy;
                                        Proxy proxy2 = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(property2, i2));
                                    }
                                    return Collections.singletonList(proxy);
                                }
                            }
                        }
                    } else if (!host.equals("::1")) {
                    }
                } else if (!host.startsWith("127.") && !host.startsWith("10.") && !host.startsWith("192.168.") && !host.startsWith("169.254.")) {
                    if (!host.endsWith(".local")) {
                        if (!host.endsWith(".internal")) {
                            if (!host.endsWith(".lan")) {
                                if (host.indexOf(46) == -1) {
                                }
                                scheme = uri.getScheme();
                                if (scheme == null) {
                                    return this.f323;
                                }
                                if ("https".equalsIgnoreCase(scheme)) {
                                }
                                return this.f324;
                            }
                        }
                    }
                }
            } else if (!host.equals("0.0.0.0")) {
                if (!host.endsWith(".local")) {
                    if (!host.endsWith(".internal")) {
                        if (!host.endsWith(".lan")) {
                            if (host.indexOf(46) == -1) {
                            }
                            scheme = uri.getScheme();
                            if (scheme == null) {
                                return this.f323;
                            }
                            if ("https".equalsIgnoreCase(scheme)) {
                            }
                            return this.f324;
                        }
                    }
                }
            }
        }
        return this.f323;
    }
}
