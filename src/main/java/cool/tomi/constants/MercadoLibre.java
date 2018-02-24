package cool.tomi.constants;

public class MercadoLibre {

    public enum Site {
        MLA("MLA"),
        MLB("MLB"),
        MCO("MCO"),
        MCR("MCR"),
        MEC("MEC"),
        MLC("MLC"),
        MLM("MLM"),
        MLU("MLU"),
        MLV("MLV"),
        MPA("MPA"),
        MPE("MPE"),
        MPT("MPT"),
        MRD("MRD");

        private final String siteId;

        Site(final String id) {
            this.siteId = id;
        }

        public String id() {
            return siteId;
        }

        @Override
        public String toString() {
            return siteId;
        }
    }
}
